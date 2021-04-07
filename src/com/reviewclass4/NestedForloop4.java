package com.reviewclass4;

public class NestedForloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i=i+2) {

			System.out.println("i");
			
			
			/*when we will entering the loop these two statements will executed int j = 0; i < 5;  
			 * after that all of the code inside the loop wil be executed and then j=j-i and the condition will be
			 * checked i < 5;  after that 
			 *  j=j-i
			 *  i < 5;
			 *    j=j-i
			 *  i < 5;
			 */
			for (int j = 0; i < 5; j=j-i) {    
				System.out.println(i + " " + j);
				i++;
			}
			System.out.println("i");
		}
	}

}
