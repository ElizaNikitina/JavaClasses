package com.class21.demo2;

public class Parent {
    int num1;
    int num2;
    String name;

    public Parent(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }

    int add(){
       return num1+num2;
    }
}
