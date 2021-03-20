package com.class16;

import java.util.Scanner;

public class StringVsStringBuilder {

   // StringBuilder sb = new StringBuilder();
   public static void main(String[] args) {

       System.out.println("How many numbers you want to add");
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       double[] numbers = new double[size];

       for(int i = 0; i<size; i++){
           System.out.println("Enter your number");
           numbers[i] = scan.nextDouble();
       }

       double sum=0;
       for(double number : numbers){
           sum+=number;
       }

       System.out.println("Sum of the numbers is" + sum);
   }

}
