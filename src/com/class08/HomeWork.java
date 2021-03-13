package com.class08;

public class HomeWork {
	
	public static void main(String[] args) {
		
		int even=0;
		int odd=0;
		
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		
		System.out.println("Summ of even number is "+ even);
		System.out.println("Summ of odd number is "+ odd);
	}

}
