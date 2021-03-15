package com.class13;

public class Account {

    String userName;
    String password;
    double balance;
    String accountNumber;
    boolean isLoggedIn;

    public void login(String passedUserNameWhenLogging, String passesPasswordWhenLiogging){
        if(userName.equals(passedUserNameWhenLogging) && password.equals(passesPasswordWhenLiogging)){
            System.out.println("Welcome to the Bank of America. Your balance is " + balance);
        }
    }

    public  void printInfo(){
        if(isLoggedIn){
            System.out.println("Your account number is " + accountNumber + ". Your balance is " + balance);
        }
    }
}
