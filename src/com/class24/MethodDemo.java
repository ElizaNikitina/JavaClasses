package com.class24;


import com.reviewclass7.methods.MethodsDemo1;

public class MethodDemo extends MethodsDemo1 {
    public static void main(String[] args) {
        MethodsDemo1.method1();
        //  method2.method1(); CE not accessible because the access modifier is not public
        MethodsDemo1.method3();
        MethodsDemo1 md=new MethodsDemo1();
      //  md.method5();
        method3();
        method1();
    }

    public void methodInTester(){
        method5();
    }
}
