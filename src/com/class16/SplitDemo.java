package com.class16;

import java.util.Locale;

public class SplitDemo {

    public static void main(String[] args) {

        String var1 = "Today is Wednesday";
        String[] strArr = var1.split(" ");

        for(String a:strArr){
            System.out.println(a + " ");
        }

        String  var2 = "Syntax is the best. batch 9 is great.";
        String [] strArr2 = var2.split("[.]");
        for(int i=0; i<strArr2.length; i++){
            System.out.println(strArr2[i]);
        }

        //method chaining
        String var3 = "       SYNTAX      ";
        System.out.println(var3.trim().toLowerCase(Locale.ROOT));


    }
}
