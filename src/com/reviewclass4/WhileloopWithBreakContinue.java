package com.reviewclass4;

public class WhileloopWithBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i<15) {
			System.out.println("Infinite");
			if(i<15) {
				continue;
			}else {
				System.out.println("Hi");
			}
			i++;
		}

	}

}
