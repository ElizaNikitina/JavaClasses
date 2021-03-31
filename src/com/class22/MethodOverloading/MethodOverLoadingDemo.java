package com.class22.MethodOverloading;

public class MethodOverLoadingDemo {

    void add(int a, int b){
        System.out.println(a + b);
    }

    void addDoubles(double a, double b){
        System.out.println(a + b);
    }

     void addArrays(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }

         System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo methodOverLoadingDemo = new MethodOverLoadingDemo();
        methodOverLoadingDemo.add(10, 20);

        methodOverLoadingDemo.addDoubles(10.5, 20.5);

        int[] arr = {10, 20, 30};
        methodOverLoadingDemo.addArrays(arr);
    }
}
