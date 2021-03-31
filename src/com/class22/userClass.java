package com.class22;

public class userClass {

    String name;
    String mobileNumber;

     userClass(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
         System.out.println("Parent constructor");

    }

}

class userInfo extends userClass{
    String address;

    userInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address = address;
        System.out.println("Child constructor");
    }

    void printInfo(){
        System.out.println("Name is " + name + " phone number is " + mobileNumber + " address " + address);
    }

}
