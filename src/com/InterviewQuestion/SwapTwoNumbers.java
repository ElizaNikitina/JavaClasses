package com.InterviewQuestion;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b; //10
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		swapTwoNum();
	}
	
	public static void swapTwoNum() {
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b; //10
		
		System.out.println("Using method");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
