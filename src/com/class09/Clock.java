package com.class09;

public class Clock {

	public static void main(String[] args) {
		
		for(int a=0; a<24; a++) {
			for(int b=0; b<60; b++) {
				System.out.println(a + ":" + b);
			}
		}
		
		
		
		
		for (int a = 0; a <24; a++) {
			for (int b = 0; b < 60; b++) {
				if (a >= 10 && b < 10) {
					System.out.println(a + ":0" + b);
				} else if (a < 10 && b >= 10) {
					System.out.println("0" + a + ":" + b);
				} else if (b < 10 && a < 10) {
					System.out.println("0" + a + ":0" + b);
				} else
					System.out.println(a + ":" + b);
			}
			System.out.println(" ");
		}
	}
}
