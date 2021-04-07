package com.reviewclass7.methods;

public class MethodTester {

    public static void main(String[] args) {
        MethodsDemo1.method1();
        MethodsDemo1.method2();
        MethodsDemo1.method3();
       // MethodsDemo1.method4(); CE access modifier is private
        MethodsDemo1 methodsDemo1=new MethodsDemo1();
        methodsDemo1.method5();

        methodsDemo1.method5();


    }
}
