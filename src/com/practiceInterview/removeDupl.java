package com.practiceInterview;

import java.util.Arrays;

public class removeDupl {

    public static void main(String[] args) {
        String s = "remove all duplicates from String";
        String result="";
        for (int i=0 ;i<s.length();i++) {
            char ch = s.charAt(i);
            if (!result.contains(""+ch)) {
                result+=""+ch;
            }
        }
        System.out.println(result);
    }
}
