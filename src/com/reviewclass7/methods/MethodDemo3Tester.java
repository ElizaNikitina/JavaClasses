package com.reviewclass7.methods;

public class MethodDemo3Tester {
    public static void main(String[] args) {

        //break till 8:30
        String name=null;
        MethodDemo3 methodDemo3=new MethodDemo3();
       // methodDemo3.methodDemo(name);
        int[] numbers={1,2,3,4,5};

        if(methodDemo3.sumTheOdds(numbers)>2){
            System.out.println("Sum is greater than 2");
        }

    }
}
