package com.class08;

public class Calculator {
	
	public static void main(String[] args) {
		
		//int num=1;
		int multpl=0;
		
		for(int i=1; i<=10; i++) {
			for ( int y=0; y<=10; y++) {
				multpl=i*y;
				System.out.println(i + " * " + y + " = " + multpl);
			}
			System.out.println("-------------");
		}
	}

}
