package com.reviewclass3;

import java.util.Scanner;

public class LogicalOperators4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scanner.next();
	
		if(pass.equals("pass123")){
			System.out.println("Enter true to check your balance and false to close the application");
			boolean nextOp=scanner.nextBoolean();
			if(nextOp) {
				System.out.println("Hello this is Zhana");
			}else {
				System.out.println("Application closed");
			}
			
		}else {
			System.out.println("password is not correct");
		}
		
		//break till 8:20
		
	}

}
