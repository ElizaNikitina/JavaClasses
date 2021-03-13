package com.class08;

import java.util.Scanner;

public class ClassTask01 {
	//print number from 1 to 50 except %3
	
	public static void main(String[] args) {
		
//		for(int i=1; i<=50; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			
//			System.out.print(i + " ");
//		}
		
		
		Scanner scan = new Scanner(System.in);
		String answer;
		String credit = "yes";
		
		
//		System.out.println("Would you like to take a credit?");
//		answer = scan.nextLine();
//		if(answer.equals(credit)){
//			System.out.println("Congrat you have a credit");
//		}else {
//			System.out.println("Maybe later");
//		}
		
		
		do {
			System.out.println("Would you like to take a credit?");
			answer = scan.nextLine();
		}while(!answer.equalsIgnoreCase(credit));
		
		System.out.println("Congrat you have a credit");
	}

}
