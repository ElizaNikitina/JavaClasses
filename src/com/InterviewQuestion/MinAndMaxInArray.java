package com.InterviewQuestion;

public class MinAndMaxInArray {

	public static void main(String[] args) {

		int[] array = { 999, 90, 1, 2, -3, 4, 5, 6, 7, 99 };

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
	}

}
