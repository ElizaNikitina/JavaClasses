package com.reviewClass;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account yuliaAccount = new Account();
        yuliaAccount.sighUp();
        boolean isSuccessful = yuliaAccount.sighIn();
        if(isSuccessful){
            System.out.println("Enter the amount that you want to transfer");
            Scanner scan = new Scanner(System.in);
            yuliaAccount.withDraw(scan.nextDouble());
        }
    }
}
