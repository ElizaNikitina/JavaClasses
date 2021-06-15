package com.class34FinallyBlock;

import java.util.Scanner;

class AgeException extends RuntimeException{
    AgeException(String message){
        super(message);
    }
}

public class Task01 {

    public static void main(String[] args) {

        checkAge();
    }

    public static void checkAge(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");

       int age = scanner.nextInt();

        if(age<18){
            throw new AgeException("You are too young");
        }
    }
}


