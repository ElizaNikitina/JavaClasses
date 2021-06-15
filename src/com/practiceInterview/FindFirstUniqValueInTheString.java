package com.practiceInterview;

import java.util.HashSet;

public class FindFirstUniqValueInTheString {
    public static void main(String[] args) {

        String one = "ababbba";

        char[] A = one.toCharArray();

        boolean tr = false;
        for (int i = 0; i < A.length; i++) {
            if (one.indexOf(A[i]) == one.lastIndexOf(A[i])) {
                tr = true;
                System.out.println(i);
                String u = Character.toString(A[i]);
                System.out.println(u);
            }

        }
        if(tr = false) {
            System.out.println("no");
        }



    }

}
