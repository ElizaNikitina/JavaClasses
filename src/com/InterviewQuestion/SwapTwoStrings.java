package com.InterviewQuestion;

public class SwapTwoStrings {

    public void swapTwoStringsMethod(String a, String b){

        a = a + b;
        b = a.substring(0, (a).length() - b.length());
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        SwapTwoStrings obj = new SwapTwoStrings();
        obj.swapTwoStringsMethod("Hello", "World");
    }
}
