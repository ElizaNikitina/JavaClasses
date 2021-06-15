package com.InterviewQuestion;

import java.util.Scanner;

public class PalindromOrNot {

    public static String palindromOrNotPalindron(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word");

        String palindrome = scan.nextLine();

        String reverse= "";

        for(int i=palindrome.length()-1; i>=0; i--){
            reverse+=palindrome.charAt(i);
        }

        if(palindrome.equals(reverse)){
            System.out.println("This word is palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }

        return palindrome;
    }

    static String palindr(String palind){
        String rever = "";
        for(int i=palind.length()-1; i>=0; i--){
            rever+=palind.charAt(i);
        }
        if(palind.equals(rever)){
            System.out.println("This word is palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
        return palind;
    }

    public static void main(String[] args) {
       // palindromOrNotPalindron();

        palindr("abba");
    }


}
