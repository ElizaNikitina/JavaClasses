package com.class17;

import java.sql.Struct;

public class ReverseString {

    static String reveseSt(String original){
        String reverse = "";

        for(int i=original.length()-1; i>=0; i--){
            reverse+=original.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
      String newOne =   reveseSt("create");

        System.out.println(newOne);
    }
}
