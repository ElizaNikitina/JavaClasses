package com.class23.Overriding;

public class Parent {

    public void printSomething(){
        System.out.println("LOL");
    }
}

class Child extends  Parent{

    public void printSomething(){
        System.out.println("LOL from child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printSomething();
    }
}