package com.InterviewQuestion;

public class FindSecondLargestInArray {
	public static void main(String[] args) {
		int[] numbers = { 110, 89, 32, 61, 16, 89, 74, 89, 25, 89, 110, -110 };
		
		int large, secondLarge;
		large=0;
		secondLarge = 0;
		
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
	}
	
	 

}
