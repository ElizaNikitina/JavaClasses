package com.class10;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		char [] array = new char[6];
		
		array[0] = 'A';
		array[1] = 'B';
		array[2] = 'C';
		array[3] = 'D';
		array[4] = 'E';
		array[5] = 'F';
		
		System.out.println(array[1]);
		
		int a = array.length;
		System.out.println(a);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		
		for(char ar:array) {
			System.out.print(ar+ " ");
		}
		
	}

}
