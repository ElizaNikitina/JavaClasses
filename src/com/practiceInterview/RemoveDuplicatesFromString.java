package com.practiceInterview;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        String a = "remove all duplicates from String";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        for(Character ch:set){
            System.out.print(ch + " ");
        }


    }

}
