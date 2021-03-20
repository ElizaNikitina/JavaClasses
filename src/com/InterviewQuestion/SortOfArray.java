package com.InterviewQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortOfArray {

    public void sortOfArrayMethod(int[] array)  {


        int max=0;
        int min=0;

        for(int i=0; i< array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]<array[j]){
                   max+=array[i];
                   array[i]=array[j];
                   array[j] = max;
                }
            }
            //System.out.println(array[i]);

        }
    }

    public static void main(String[] args) throws IOException {
        SortOfArray obj = new SortOfArray();

        int[] array = {22,3,4,55,22,4,5,6,99};
        obj.sortOfArrayMethod(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        //System.out.println(obj.sortOfArrayMethod());
    }


}
