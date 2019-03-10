package com.example.dell_owner.myparkingapp;

public class User {
    public int code;
    public int value;

    public User(){}

    public User(int code, int value){
        this.code = code;
        this.value = value;
    }

    public int getCode(){
        return this.code;
    }

    public int getValue(){
        return this.value;
    }
}
