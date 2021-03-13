package com.InterviewQuestion;

import java.util.Scanner;

public class IsPrimeOrNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int number = scan.nextInt();

		// int number = 7;
		boolean isPrime = true;

		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}

		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is NOT a prime number");
		}

		scan.close();
	}

}
