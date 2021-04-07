package com.reviewclass3;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * logical operators are used to combine multiple conditions in the same if block
		 */
		//Without Logical Operators
		String day="Monday";
		
		if("Sunday".equals(day)) {
			System.out.println("Relax its weekend don't blink otherwise its over");	
		}else if(day.equals("Saturday")) {
			System.out.println("Relax its weekend don't blink otherwise its over");
		}else {
			System.out.println("I have to goto work");
		}
		
		//Using Logical operators
		if("Sunday".equals(day)||day.equals("Saturday")) {
			System.out.println("Relax its weekend don't blink otherwise its over");
		}else {
			System.out.println("I have to goto work");
		}
		

	}

}
