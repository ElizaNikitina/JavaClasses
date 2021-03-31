package com.class21.demo2;

public class ChildClass extends Parent {
    int num1;
    int num2;
    public ChildClass(int num1, int num2, String name) {
        super(num1, num2, name);
    }

    int average(){
       return super.add()/2;
    }


    int add() {
        return super.num1+super.num2;
    }
}
