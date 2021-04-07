package com.InterviewQuestion;

public class MaxInArray {

    public static void main(String[] args) {

        int[] array = {1,2,30,42,5,6,7,8,9};

        int max = array[0];

        for(int a:array){
            if(a>max){
                max=a;
            }
        }

        System.out.println(max);
    }
}
