package com.class08;

import java.util.Scanner;

public class ClassTask03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String item;
		int price;
		int money;
		int differentOfAmount;
		int amount=0;
		
		System.out.println("Please enter an item you would like to buy");
		item = scan.nextLine();
		
		System.out.println("Please enter the price of " + item);
		price = scan.nextInt();
		
		do {
			System.out.println("Please pay for " + item);
			money = scan.nextInt();
			amount+=money;
			
			if(amount<price) {
				differentOfAmount=price-amount;
				System.out.println("You need pay more " + differentOfAmount+"$");
			}else if(amount>price) {
				differentOfAmount= price-amount;
				System.out.println("Here is your change " + differentOfAmount +"$");
			}else {
				System.out.println("You got the right amount");
			}
		}while(price!=amount);
		
		System.out.println("Thank you for shopping");
		
		scan.close();
	}

}
