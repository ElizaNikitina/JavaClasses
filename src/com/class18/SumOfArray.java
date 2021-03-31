package com.class18;

public class SumOfArray {

    protected int sumOfArray(int[] array){
        int sum=0;
        for(int ar:array){
         sum+=ar;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();

        int[] array = new int[]{2,4,5,6,7,8,9};
       int a =  obj.sumOfArray(array);
        System.out.println(a);
    }
}
