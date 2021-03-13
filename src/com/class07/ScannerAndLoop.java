package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	
	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		
		scan = new Scanner(System.in);
		int i=5;
		
		while(i>=0) {
			System.out.println("Please enter your name");
			name = scan.nextLine();
			System.out.println("Hello "+ name);
			i--;
		}
		scan.close();
	}

}
