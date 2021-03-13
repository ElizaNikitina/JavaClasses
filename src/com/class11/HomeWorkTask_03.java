package com.class11;

public class HomeWorkTask_03 {
	public static void main(String[] args) {
		
		int[][] numbers = {
				{1,2,3,4,5,6},
				{7,8,9,10,11},
				{2,5,8,3},
				{3,6,2,4,1}
		};
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int[] a:numbers) {
			for(int b: a) {
				if(b%2==0) {
					sumEven+=b;
				}else {
					sumOdd+=b;
				}
			}
		}
		
		System.out.println("Sum of even numbers is: " + sumEven);
		System.out.println("Sum of odd numbers is: " + sumOdd);
	}

}
