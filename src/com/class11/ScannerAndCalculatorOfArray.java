package com.class11;

import java.util.Scanner;

public class ScannerAndCalculatorOfArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double sum = 0;

		System.out.println("Please enter the number of element would you like to store");

		int size = scan.nextInt();

		double[] arrays = new double[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter a double");
			arrays[i] = scan.nextDouble();
			sum+=arrays[i];
		}

//		for (double num : arrays) {
//			sum += num;
//
//		}
		
		
		System.out.println("The sum of my array " + sum);
		scan.close();
	}
}
