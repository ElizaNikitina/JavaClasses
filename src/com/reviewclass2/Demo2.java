package com.reviewclass2;

public class Demo2 {

	public static void main(String[] args) {
		int number1 = 2;
		
		
		  if(number1%5==0) { System.out.println("Number is divisible by 5"); }else
		  if(number1%2==0){ System.out.println("Number is divisible by 2"); }else
		  if(number1%10==0) { System.out.println("Number is divisible by 10"); }
		  
		 
		 
		if (number1 % 5 == 0) {
			System.out.println("Number is divisible by 5");
			if (number1 % 2 == 0) {
				System.out.println("Number is divisible by 2");
				if (number1 % 10 == 0) {
					System.out.println("Number is divisible by 10");
				}
			}

		}

	}

}
