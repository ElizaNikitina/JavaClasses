package com.class22.MethodOverloading;

public class MethodOverLoadingDemo2 {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }

        System.out.println(sum);

    }
    void add(int a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo2 obj = new MethodOverLoadingDemo2();
        obj.add(10, 20);
        obj.add(10.5, 20.5);
        obj.add(10, 10.5);

        int[] arr = {10, 30, 20};
        obj.add(arr);
    }
}
