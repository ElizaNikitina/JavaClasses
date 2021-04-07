package com.reviewclass3;

import java.util.Scanner;

public class QA3 {

	public static void main(String[] args) {
		int age;
		char gender;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		gender = input.next().charAt(0);
		System.out.println("Please enter your age");
		age = input.nextInt();
		
		
		if (gender == 'F') {
		
			if(age<25) {
				result = "Girl";
			}else {
				result = "Women";
			}
			
		}else {
			if(age<25) {
				result = "Boy";
			}else {
				result = "Men";
			}
		}
		
	}
}
