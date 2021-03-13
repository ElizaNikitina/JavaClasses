package com.InterviewQuestion;

public class FibonSequance {
	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series
		
		int a, b, c;
		a=0;
		b=1;
		for(int i=1; i<=10; i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(a + " ");
		}

		
		/*
		 * int a=0;
		 * int b=0;
		 * 
		 * for(int i=0; i<=10; i++){
		 * a=a+b;
		 * b=a-b;
		 */
	}
}
