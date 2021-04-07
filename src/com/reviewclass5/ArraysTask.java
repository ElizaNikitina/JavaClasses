package com.reviewclass5;

import java.util.Scanner;

public class ArraysTask {

    public static void main(String[] args) {

        System.out.println("How many numbers you want to add");
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();
        double[] numbers=new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your number");
            numbers[i]=scanner.nextDouble();
        }
        double sum=0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the numbers is "+sum);

    }
}
