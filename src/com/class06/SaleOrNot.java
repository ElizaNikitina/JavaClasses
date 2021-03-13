package com.class06;

import java.util.Scanner;

public class SaleOrNot {
	
	public static void main(String[] args) {
		
		boolean sale;
		double price;
		double newPrice = 0;
		String item;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Is there sale in the mall?");
		sale = scan.nextBoolean();
		
		if(!sale) {
			System.out.println("There is no sale");
			
			System.out.println("I am not going to mall");
			
		}else {
			System.out.println("I am going to sale");
			System.out.println("What do you have in your basket?");
			item = scan.next();
			System.out.println("What is the price?");
			price = scan.nextDouble();
			
			int discount = 0;
			if(price >0 && price<10) {//5% discount
				
				newPrice=price - (price*0.05);
				discount = 5;
			}else if(price >=10 && price <100) { //10% discount
				newPrice=price - (price*0.1);
				discount = 10;
			}else if(price >=100 && price <500) { //20% discount
				discount = 20;
				newPrice=price - (price*0.2);
				
			}else if(price >=500) { //30% discount
				discount = 30;
				newPrice=price - (price*0.3);
			}
			System.out.println("Your " + item + " price before discount is: " + price + " and you discount is " + discount + "%. Total price is " + newPrice);
		}
		
		scan.close();
	}

}
