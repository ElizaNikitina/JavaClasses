package com.reviewclass3;

import java.util.Scanner;

public class QA2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    int num1, num2;
    String str, word2;
    String print;
    System.out.println("Please enter two number and two word");
    num1 = input.nextInt();
    System.out.println("Please enter two number and two word");
    num2 = input.nextInt();
    System.out.println("Please enter first word");
    input.nextLine();
    str = input.nextLine();
    System.out.println("Please enter 2nd word");
    word2 = input.nextLine();
    if (num1 == num2 && str.equals(word2)) {
      print = "AND";
    } else if (num1 != num2 && str.equals(word2)) {
      print = "OR";
      }else if(num1 == num2 && str!=word2) {
    	  print = "OR";
    } else {
      print = "NONE";
    }
    System.out.println(print);
}
}
