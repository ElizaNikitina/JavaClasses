package com.class11;

public class HomeWorkTask_02 {
	
	public static void main(String[] args) {
		
		int[][] numbers = {
				{1,2,3,4,5,6,7,8,9},
				{2,3,4,5,6,7,8,8},
				{20, 30,40,50, 7},
				{11, 12, 3, 6, 9},
		};
		
		
		for(int[] a:numbers) {
			for(int b:a) {
				if(b%2==0) {
					System.out.print(b + " ");
				}
				//System.out.println();
			}
		}
	}

}
