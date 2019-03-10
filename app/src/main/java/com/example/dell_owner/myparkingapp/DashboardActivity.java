package com.example.dell_owner.myparkingapp;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DashboardActivity extends AppCompatActivity {

    private Button mButtonOpen, mButtonClosed, mButtonFaculty, mButtonHandicapped;

    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("spots");

    int n = 1;
    String i = "1";
    int countOpen = 0;
    int countClosed = 36;
    int countFaculty = 0;
    int countHandicapped = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mButtonOpen = (Button)findViewById(R.id.openButton);
        mButtonClosed = (Button)findViewById(R.id.closedButton);
        mButtonFaculty = (Button)findViewById(R.id.facultyButton);
        mButtonHandicapped = (Button)findViewById(R.id.handicappedButton);

        while(n <= 36){
            mDatabase.child(i).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    User user = dataSnapshot.getValue(User.class);
                    int userStatus = user.getValue();
                    int userCode = user.getCode();
                    if(userStatus == 1){
                        countOpen = countOpen + 1;
                        countClosed = countClosed - 1;
                        if(userCode == 2){
                            countFaculty = countFaculty + 1;
                        }
                        else
                            if(userCode == 3){
                                countHandicapped = countHandicapped + 1;
                            }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    // Failed to read value
                    Log.w("TAG", "Failed to read value.");
                }
            });
            n = n + 1;
            i = i + 1;
        }


        //mButtonOpen.setText(Integer.toString(countOpen));
        //mButtonClosed.setText(Integer.toString(countClosed));
        //mButtonFaculty.setText(Integer.toString(countFaculty));
        //mButtonHandicapped.setText(Integer.toString(countHandicapped));

        final Intent intent = new Intent(getApplicationContext(), ParkingActivity.class);

        mButtonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                intent.putExtra("value", 1);
            }
        });


        mButtonClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                intent.putExtra("value", 0);
            }
        });

        mButtonFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
               intent.putExtra("value", 2);
            }
        });

        mButtonHandicapped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                intent.putExtra("value", 3);
            }
        });
    }

}
