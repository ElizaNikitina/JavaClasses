package com.reviewclass5;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
         Account yuliaAccount=new Account();
         yuliaAccount.signUp();
         boolean isSuccessful=yuliaAccount.signIn();
         if(isSuccessful){
             System.out.println("Enter the amount that you want to transfer");
             Scanner scanner=new Scanner(System.in);
             yuliaAccount.withDraw(scanner.nextDouble());
         }

         /*
         add transfer behaviour
          */

    }
}
