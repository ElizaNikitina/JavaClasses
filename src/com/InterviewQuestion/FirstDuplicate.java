package com.InterviewQuestion;

import java.util.Arrays;
import java.util.HashSet;

public class FirstDuplicate {

     static int unique_array(int[] my_array){

         HashSet hs = new HashSet();

         for(int n:my_array){
             if(hs.contains(n))
                 return n;
             else
                 hs.add(n);
         }
         return -1;

     }

    public static void main(String[] args)
    {
        System.out.println(unique_array(new int[] {2, 1, 3, 5, 3, 2}));

        // unique_array(new int[] {10, 22, 10, 20, 11, 22});

    }
}
