package com.class18;

public class VowelLetters {

    private static String onlyVowels(String input){

        String  str = input.replaceAll("[^a,e,i,o,u]", "");

        return str;
    }

    public static void main(String[] args) {
      String output =  onlyVowels("public");

        System.out.println(output);
    }
}
