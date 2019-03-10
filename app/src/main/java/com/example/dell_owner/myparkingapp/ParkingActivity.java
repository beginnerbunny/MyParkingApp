package com.example.dell_owner.myparkingapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ParkingActivity extends AppCompatActivity {
    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("spots");

    private Button mSpot1, mSpot2, mSpot3, mSpot4, mSpot5, mSpot8, mSpot6, mSpot7,
                    mSpot15, mSpot9, mSpot10, mSpot11, mSpot12, mSpot13, mSpot14,
                    mSpot16, mSpot17, mSpot18, mSpot19, mSpot20, mSpot21, mSpot22,
                    mSpot23, mSpot24, mSpot25, mSpot26, mSpot27, mSpot28, mSpot29,
                    mSpot30, mSpot31, mSpot32, mSpot33, mSpot34, mSpot35, mSpot36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        //Instantiate buttons
        mSpot1 = (Button)findViewById(R.id.spot1);
        mSpot2 = (Button)findViewById(R.id.spot2);
        mSpot3 = (Button)findViewById(R.id.spot3);
        mSpot4 = (Button)findViewById(R.id.spot4);
        mSpot5 = (Button)findViewById(R.id.spot5);
        mSpot6 = (Button)findViewById(R.id.spot6);
        mSpot7 = (Button)findViewById(R.id.spot7);
        mSpot8 = (Button)findViewById(R.id.spot8);
        mSpot9 = (Button)findViewById(R.id.spot9);
        mSpot10 = (Button)findViewById(R.id.spot10);
        mSpot11 = (Button)findViewById(R.id.spot11);
        mSpot12 = (Button)findViewById(R.id.spot12);
        mSpot13 = (Button)findViewById(R.id.spot13);
        mSpot14 = (Button)findViewById(R.id.spot14);
        mSpot15 = (Button)findViewById(R.id.spot15);
        mSpot16 = (Button)findViewById(R.id.spot16);
        mSpot17 = (Button)findViewById(R.id.spot17);
        mSpot18 = (Button)findViewById(R.id.spot18);
        mSpot19 = (Button)findViewById(R.id.spot19);
        mSpot20 = (Button)findViewById(R.id.spot20);
        mSpot21 = (Button)findViewById(R.id.spot21);
        mSpot22 = (Button)findViewById(R.id.spot22);
        mSpot23 = (Button)findViewById(R.id.spot23);
        mSpot24 = (Button)findViewById(R.id.spot24);
        mSpot25 = (Button)findViewById(R.id.spot25);
        mSpot26 = (Button)findViewById(R.id.spot26);
        mSpot27 = (Button)findViewById(R.id.spot27);
        mSpot28 = (Button)findViewById(R.id.spot28);
        mSpot29 = (Button)findViewById(R.id.spot29);
        mSpot30 = (Button)findViewById(R.id.spot30);
        mSpot31 = (Button)findViewById(R.id.spot31);
        mSpot32 = (Button)findViewById(R.id.spot32);
        mSpot33 = (Button)findViewById(R.id.spot33);
        mSpot34 = (Button)findViewById(R.id.spot34);
        mSpot35 = (Button)findViewById(R.id.spot35);
        mSpot36 = (Button)findViewById(R.id.spot36);

        mSpot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "1";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot1.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot1.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        // Failed to read value
                        Log.w("TAG", "Failed to read value.");
                    }
                });

            }
        });

        mSpot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "2";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot2.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot2.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });


        mSpot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id="3";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot3.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot3.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        mSpot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "4";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot4.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot4.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "5";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot5.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot5.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "6";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot6.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot6.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id  = "7";

                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot7.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot7.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "8";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot8.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot8.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "9";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot9.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot9.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "10";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot10.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot1.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "11";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot11.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot11.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "12";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot12.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            mSpot12.setBackgroundColor(Color.parseColor("#ff0000"));
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "13";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot13.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot13.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "14";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot14.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot14.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "15";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot15.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot15.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        mSpot16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String id = "16";

                mDatabase.child(id).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        int userStatus = user.getValue();
                        if(userStatus == 0){
                            mSpot16.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(getApplicationContext(),"Spot is already booked", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            int newValue = 0;
                            mDatabase.child(id).child("value").setValue(newValue);
                            mSpot16.setBackgroundColor(Color.parseColor("#ff0000"));
                            Toast.makeText(ParkingActivity.this, "Spot is successfully booked", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
