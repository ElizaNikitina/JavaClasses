package com.class08;

import java.util.Scanner;

public class ClassTask02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		int a = scan.nextInt();

		System.out.println("Please enter second number");
		int b = scan.nextInt();

		int even = 0;
		int odd = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					even += i;
				} else {
					odd += i;
				}
			}
			System.out.println("Sum of Even numbers from range " + a + " to " + b + " is " + even);
			System.out.println("Sum of Odd numbers from range " + a + " to " + b + " is " + odd);
		}else {
			System.out.println("Inposible to calculate");
		}

		scan.close();
	}
}
