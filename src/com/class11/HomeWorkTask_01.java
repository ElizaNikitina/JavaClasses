package com.class11;

public class HomeWorkTask_01 {

	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3, 4, 5 }, 
				{ 10, 20, 30, 40, 50 }, 
				{ 100, 200, 300, 400, 500 }
		};
		int sum = 0;
		
		
		for(int[] a:numbers) {
			for(int b:a) {
			sum+=b;	
			}
		}
		
		System.out.println(sum);
	}

}
//1500+150+15=1665