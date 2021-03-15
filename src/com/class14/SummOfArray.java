package com.class14;

public class SummOfArray {

    public int sumOfArras(int[] arr){

       // int[]a = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0; i<arr.length;i++){
          sum+=arr[i];
        }
        return sum;
    }
}
