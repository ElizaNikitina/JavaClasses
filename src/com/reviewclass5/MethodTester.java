package com.reviewclass5;

public class MethodTester {
    public static void main(String[] args) {
        MethodsDemo obj=new MethodsDemo();
        obj.simpleMethod();
        System.out.println(obj.simpleIntMethod());
        int number = obj.simpleIntMethod();
        System.out.println(number);

        obj.onlyTakesInput(100);
        obj.methodWithTwoInputs("Eugene",180000);

        System.out.println(obj.sum(12,12));

        System.out.println(obj.isNumberPositive(12));
        System.out.println(obj.isNumberPositive(-12));

    }
}
