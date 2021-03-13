package com.class08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileReview {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int soda = 3;
		int money = 0;

		System.out.println("Please give money");
		money = Integer.parseInt(reader.readLine());
		
		while (money != soda) {
			
			if (money < soda) {
				System.out.println("Please give more money");
			} else if (money > 3) {

				System.out.println("Please give less money");
			}
			
			money = Integer.parseInt(reader.readLine());
	
		}

		System.out.println("You can get Soda");

	}

}
