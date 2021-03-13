package com.class07;

public class ClassTask02 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=20; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
//		
//		int i=20;
//		while(i<=50) {
//			if(i%2==1) {
//				System.out.print(i + " ");
//			}
//		}
		System.out.println();
		
		for(int a=21; a<=50; a+=2) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		int sum=0;
		for(int a=1; a<=5; a++) {
			sum = sum+a;
		}
		System.out.println("-----");
		System.out.println(sum);
		
		
		int res=0;
		for(int a=2; a<=10; a+=2) {
			res+= a;
		}
		System.out.println("-----");
		System.out.println(res);
	}

}
