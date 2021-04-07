package com.reviewclass2;

import java.util.Scanner;

public class Debug {
	public static void main(String[] args) {
		String userName;
		String password;
		System.out.println("Please enter Username");
		Scanner scanner=new Scanner(System.in);
		userName=scanner.next();
		System.out.println("Please enter your password");
		password=scanner.next();
	
		double accountBalance=1000;
		double amountToTransfer;
		
		if(userName.equals("salma")) {
			
			if(password.equals("salma123")) {
				System.out.println("Welcome to bank of America");
				System.out.println("Please enter the amount to transfer");
				amountToTransfer=scanner.nextDouble();
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount transfred");
				
				}else {
					System.out.println("Insuficient balance");
				}
			}else {
				System.out.println("Incorrect password");
			
			}
		
			}else {
			System.out.println("username is not correct please try again");
		}
	}
	

}
