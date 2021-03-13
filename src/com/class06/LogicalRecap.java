package com.class06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogicalRecap {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scan;
		int time;
		String timeOfTheDay;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter time in 24 hours format");
		time = scan.nextInt();
		
		if(time>=1 && time <=11) {
			timeOfTheDay = "Morning";
		}else if (time>=12 && time <=13) {
			timeOfTheDay = "Noon";
		}
		
		
		
	}

}
