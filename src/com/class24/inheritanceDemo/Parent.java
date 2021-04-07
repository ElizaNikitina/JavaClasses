package com.class24.inheritanceDemo;

public class Parent {
   String name;
    void printInfo(){
        System.out.println("Print Info from child "+name);
    }

}

class Child extends Parent{

    void printInfo(){
        System.out.println("Print Info from child "+name);
    }

}

class  Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
    }
}