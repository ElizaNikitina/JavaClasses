package com.class33EXEPTIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Caught InterruptedException");
        }

        System.out.println("Continue to next try block");

        String path = "";
        try {
            FileInputStream fis = new FileInputStream(path);
        } catch (FileNotFoundException fne) {
           // fne.printStackTrace();
            System.out.println("Caught FileNotFoundException");
        }

        System.out.println("Continue to next try block");

        int a=10;
        int b=0;

        try {
            System.out.println(a/b);//new ArithmeticException();
            System.out.println("I am code inside try block");//this block will get ignored if exception occurs

        }catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException Exception");
        }

        System.out.println("End of the program");
    }
}
