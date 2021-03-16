package com.InterviewQuestion;

public class FindAlphaCharactersInString {

    public void findAlphaCharacters(String given){

        given = given.replaceAll("[A-Za-z]", "");
        int number = given.length();

        System.out.println("Number of alpha Characters is " + number);

        /*
         System.out.println("________________________________");
	    String word=name.replaceAll("[A-za-z0-9!?.,]", "");
	    int b=word.length();
	    System.out.println("The number of words is "+(b+1));

	    System.out.println("________________________________");
	    String[] array = name.split(" ");
	    int words = array.length;
	    System.out.println("Total words in string " + name + " is  " + words);
         */


    }

    public static void main(String[] args) {
        FindAlphaCharactersInString obj = new FindAlphaCharactersInString();
        obj.findAlphaCharacters("Hqwee tenm2334 q34v !!!,,");

    }
}
