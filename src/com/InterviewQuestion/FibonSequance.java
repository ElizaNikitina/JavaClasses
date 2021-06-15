package com.InterviewQuestion;

public class FibonSequance {
	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series
		System.out.println(febonMethod());

		}

		public static int febonMethod(){

			int a, b, c;
			a=0;
			b=1;
			for(int i=1; i<=10; i++) {

				System.out.print(a + " ");
				c=a+b;
				a=b;
				b=c;

				//System.out.print(a + " ");

		}
			return a;
	}
}
