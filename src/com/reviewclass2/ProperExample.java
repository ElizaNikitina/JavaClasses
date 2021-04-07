package com.reviewclass2;

public class ProperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="Salma";
		String password="Salma123";
		double accountBalance=1000;
		double amountToTransfer=200;
		
		if(userName.equals("Salma")) {
			
			if(password.equals("Salma123")) {
				
				System.out.println("Welcome to bank of America");
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount transffered");
				}else {
					System.out.println("insufficient balance");
				}
				
			}else {
				System.out.println("Incorrect password");
			}
			
		}else {
			
			System.out.println("your username is not correct please try again later");
		}

	}

}
