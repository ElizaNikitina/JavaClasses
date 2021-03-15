package com.InterviewQuestion;

import java.util.Scanner;

public class PalindromOrNot {

    public static String palindromOrNotPalindron(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word");

        String palindrom = scan.nextLine();

        String reverse= "";

        for(int i=palindrom.length()-1; i>=0; i--){
            reverse+=palindrom.charAt(i);
        }

        if(palindrom.equals(reverse)){
            System.out.println("This word is palindrom");
        }else{
            System.out.println("This is not a palindrom");
        }

        return palindrom;
    }

    static String palindr(String palind){
        String rever = "";
        for(int i=palind.length()-1; i>=0; i--){
            rever+=palind.charAt(i);
        }
        if(palind.equals(rever)){
            System.out.println("This word is palindrom");
        }else{
            System.out.println("This is not a palindrom");
        }
        return palind;
    }

    public static void main(String[] args) {
       // palindromOrNotPalindron();

        palindr("abba");
    }


}
