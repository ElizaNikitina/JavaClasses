package com.practiceInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToEvenAndOdd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(Integer i : list){
            if(i%2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);
    }
}
