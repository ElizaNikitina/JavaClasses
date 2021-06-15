package com.practiceInterview;

import java.sql.Array;
import java.util.ArrayList;

public class RandomNumberOfArrayListOddAndEven {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int limit = 10;
        while(limit>0) {
            int randomNum = (int) (Math.random() * ((20 - 1) + 1) + 1);
            array1.add(randomNum);
            limit--;
        }

        for(int i: array1){
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

