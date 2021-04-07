package com.reviewclass2;

public class IfBlocks {
	public static void main(String[] args) {
		int number1 = 2;

		/*
		 * if (number1 % 5 == 0) { System.out.println("Number is divisible by 5"); if
		 * (number1 % 2 == 0) { System.out.println("Number is divisible by 2"); if
		 * (number1 % 10 == 0) { System.out.println("Number is divisible by 10"); } }
		 * 
		 * }
		 */

		// if a number is divisible by 2 5 and 10 3 lines should be printed if it is
		// divisible only by
		// 5 10 two lines should be printed and if it is divisible only by 10 one line
		// should be printed

		if (number1 % 5 == 0) {
			System.out.println("Number is divisible by 5");
		} else {
			if (number1 % 2 == 0) {
				System.out.println("Number is divisible by 2");
			} else {

			}
		}

	}

}
