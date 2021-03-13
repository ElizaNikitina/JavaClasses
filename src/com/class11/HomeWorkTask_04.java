package com.class11;

public class HomeWorkTask_04 {
	
	public static void main(String[] args) {
		
		String[][] country = {
				{"Tailand", "Vietnam", "Philippini", "China", "Nepal"},//Asia
				{"Germany", "Finland", "France", "Poland"},//Europe
				{"Egipt", "Marocco", "Algir"},//Africa
				{"USA", "Canada"}//North America
		};
		
		
		int countCountry=0;
		
		for(String[] a:country) {
			for(String b:a) {
				countCountry++;
			}
		}
		System.out.println("Inhence for loop result is: "+countCountry);
		countCountry=0;
		
		
		for(int i=0; i<country.length; i++) {
			for(int j=0; j<country[i].length; j++) {
				countCountry++;
			}
		}
		
		System.out.println("For loop classic result is: " +countCountry);
	}
	
}
