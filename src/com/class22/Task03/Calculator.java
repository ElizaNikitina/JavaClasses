package com.class22.Task03;

public class Calculator {

    //int a;
    static void calculate(int a){
        System.out.println("I am calculate area of square " + (a * a));
    }

    static void calculate(int a, int b){

        System.out.println("I am calculate area of a rectangle "+ (a * b));
    }

    static void calculate(int a, int b, int c){
        System.out.println("I am calculate area of box " + (a * b * c));
    }


    public static void main(String[] args) {
        calculate(3);
        calculate(3,4);
        calculate(3,4,5);
    }

}
