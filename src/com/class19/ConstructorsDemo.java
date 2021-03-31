package com.class19;

import java.util.Scanner;

public class ConstructorsDemo {
	
	
	ConstructorsDemo(){
		System.out.println("Constructor called");
	}
	
	int returnNumber() {
		return 10;
	}
	
	public static void main(String[] args) {
		
		ConstructorsDemo obj=new ConstructorsDemo();
		int var1=obj.returnNumber();
		Scanner scanner=new Scanner(System.in);
		
		
	}
	
}
