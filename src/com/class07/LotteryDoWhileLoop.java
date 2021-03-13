package com.class07;

import java.util.Scanner;

public class LotteryDoWhileLoop {
	
	public static void main(String[] args) {
		Scanner input;
		int num;
		int lotteryNumber = 17;
		
		input = new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 50");
			num = input.nextInt();
		}while(num!=lotteryNumber);
		
		System.out.println("Congratulation your eneterd " + num + " And Won!!!");
		
		input.close();
	}

}
