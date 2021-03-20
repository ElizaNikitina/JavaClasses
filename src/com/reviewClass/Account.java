package com.reviewClass;

import java.util.Scanner;

public class Account {

    String userName;
    String password;
    double balance;

    void sighUp(){
        System.out.println("Welcome to Bank if America");
        System.out.println("Chose your user name");
        Scanner scan = new Scanner(System.in);
        userName = scan.next();
        System.out.println("Please choose a password");
        password = scan.next();
        System.out.println("Enter amount that you want to deposit");
        balance = scan.nextDouble();
    }

    boolean sighIn(){
        System.out.println("Please enter your user name");

        Scanner scan = new Scanner(System.in);
        String enteredUserName = scan.next();
        System.out.println("Please enter your password");
        String  enteredPassword = scan.next();
        if(enteredUserName.equals(userName) && enteredPassword.equals(password)){
            System.out.println("Welcome to the bank");
            return true;
        }else{
            System.out.println("Either user name or password is not correct");
            return false;
        }


    }

    public void withDraw(double amountToWithdraw){
        if(amountToWithdraw>balance){
            System.out.println("Not enough balance");
        }else{
            balance = balance-amountToWithdraw;
            System.out.println("Operation Successful");
        }
    }



}
