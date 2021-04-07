package com.reviewclass5;

public class ArraysDemo {
    public static void main(String[] args) {
        /*
        We use variables to hold single values
        primitive data types
        byte short char int float double long boolean
         */
        int num=10;
        String name="Alina";
        name="Monika";
        System.out.println(name);
        /*
        limitation of variables is that we can only store a single value at a time
        if we try to store a new value previous value is overridden by the latest value
        to overcome this issues java has Arrays in arrays we can store multiple values using a single array type
        variable
         */
        // one D arrays
        String [] names= new String[10]; // recommended approach
        //String names2[]=new String[10];
        names[0]="Alina";
        names[1]="Monika";
        names[2]="Azizi";
        //2D arrays declaration
        int [][] numbers=new int[10][10];
        numbers[0][0]=12;
        numbers[0][1]=20;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

       // int  numbers2[][][]=new int[10][][]; 3D arrays







    }
}
