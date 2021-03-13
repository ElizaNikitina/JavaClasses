package com.class07;

public class ClassTask {
	public static void main(String[] args) {

		int i = 1;

		while (i <= 100) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("============");

		int j = 100;

		while (j >= 1) {
			System.out.print(j + " ");
			j--;
		}
		System.out.println();
		System.out.println("============");

		int a = 20;

		while (a <= 100) {
			if (a % 2 == 0)
				System.out.print(a + " ");
			a++;
		}
	}

}
