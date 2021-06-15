package com.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinAndMaxInArray {

	public static void main(String[] args) {

		int[] array = { 999, 90, 1, 2, -3, 4, 5, 6, 7, 99 };

		Arrays.sort(array);
		int c = array[array.length-2];
		System.out.println("First method " + c);

		int max, min;
		min = max = array[0];

		// Use a for-each style for loop.
		for (int v : array) {
			if (v < min)
				min = v;
			if (v > max)
				max = v;
		}
		System.out.println("min " + +min + " and max: " + max);


			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter how many numbers do you want?");
			int a = scan.nextInt();
			ArrayList<Integer> array2 = new ArrayList<>();

			for (int i=0; i<a; i++){
				System.out.println("Please enter your number");
				int b = scan.nextInt();
				array2.add(b);
			}

			int min2 = Collections.min(array2);
			int max2 = Collections.max(array2);


			System.out.println("Min is: " + min2);
			System.out.println("Max is: " + max2);

	}

}
