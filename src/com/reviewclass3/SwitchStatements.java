package com.reviewclass3;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {
		
		char op;
		int num1;
		int num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first number");
		System.out.println("Enter your second number");
		System.out.println("Enter the oprations");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		op=scanner.next().charAt(0);
		
		if(op=='+') {
			System.out.println(num1+num2);
		}else if(op=='-') {
			System.out.println(num1-num2);
		}else {
			System.out.println("Unknown");
		}
		
		
		switch(op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case'-':
			System.out.println(num1-num2);
			break;
			default:
				System.out.println("unknown");
		}
		
	}

}
