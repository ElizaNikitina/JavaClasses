package com.class11;

public class AllVAluesFrom2DArray {
	
	public static void main(String[] args) {
		
		String [][] usa = {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strousburg", "Pittsburg"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Asgeles", "Long Beach", "San Fransico", "Sacramento", "Santa Barbara"},
				{"Miami", "Tampa", "Orlando", "Saint Pete"}
		};
		
		System.out.println(usa.length); //number of rows 5
		System.out.println(usa[0].length); //number of elements 1st array
		System.out.println(usa[1].length);
		System.out.println(usa[2].length);
		System.out.println(usa[3].length);
		System.out.println(usa[4].length);
		
		for(int i=0; i<usa.length; i++) {
			for(int j=0; j<usa[i].length; j++) {
				System.out.print(usa[i][j] + " ");
			}
			System.out.println();
		}
	}

}
