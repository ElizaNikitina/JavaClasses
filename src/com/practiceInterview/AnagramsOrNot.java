package com.practiceInterview;

import java.util.Arrays;

public class AnagramsOrNot {

    static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().toCharArray();
        char[] word2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
    public static void main(String[] args) {

        String A="AcBA";
        String B="BABA";
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
