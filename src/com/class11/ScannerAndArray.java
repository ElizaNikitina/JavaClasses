package com.class11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerAndArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//String element;
		String[] array;

		System.out.println("Please enter the number of element would you like to store");

		int a = Integer.parseInt(reader.readLine());

		array = new String[a];
		
		for(int i=0; i<a; i++) {
			System.out.println("Please enter a String");
			array[i] = reader.readLine();
		}
		
		for(String word:array) {
			System.out.print(word + " ");
		}

		reader.close();
	}
}
