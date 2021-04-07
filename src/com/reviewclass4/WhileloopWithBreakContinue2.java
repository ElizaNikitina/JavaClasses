package com.reviewclass4;

public class WhileloopWithBreakContinue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i<15) {
			System.out.println("Infinite");
			if(i<15) {
				break;
			}else {
				System.out.println("Hi");
			}
			i++;
		}
		
		System.out.println("After the loop");

	}

}
