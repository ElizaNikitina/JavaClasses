package com.InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestInArray {
	public static void main(String[] args) {
		int[] numbers = { 110, 89, 32, 61, 16, 89, 74, 89, 25, 89, 110, -110 };

//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter length of array");
//		int leng = scan.nextInt();
//		int [] numbers = new int[leng];
//
//		System.out.println("enter " + leng + " numbers");
//		for(int i=0; i<leng; i++){
//			numbers[i] = scan.nextInt();
//		}

		int large=0;
		int secondLarge = 0;

		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>large) {
				secondLarge=large;
				large=numbers[i];
			}else if(numbers[i]>secondLarge && numbers[i]!=large) {
				secondLarge=numbers[i];
			}
		}

		System.out.println("First largest is " + large);
		System.out.println("Second largest is " + secondLarge);

//		Arrays.sort(numbers);
//		int size= numbers.length;
//
//		int result = numbers[size-2];
//		System.out.println(result);
	}
	
	 

}
