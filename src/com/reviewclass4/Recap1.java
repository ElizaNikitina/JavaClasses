package com.reviewclass4;

public class Recap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("int i=10; \n"+i);
		i=i-20;
		System.out.println("int i=10; \n"+i);
		i-=10;  //i=i-10 -20-10=>-30
		System.out.println("int i=10; \n"+i);
		i--;   //-30-1=>-31
		System.out.println("int i=10; \n"+i);
		--i;   //-31-1=>-32
		System.out.println("int i=10; \n"+i);
		
		i=10;
		System.out.println("--i "+(--i)); // first increment the value then use it
		System.out.println("i--  "+(i--));  // first use the value then increment
		System.out.println("i  "+i);  //in the next line updated value will reflect in i
		
	}

}
