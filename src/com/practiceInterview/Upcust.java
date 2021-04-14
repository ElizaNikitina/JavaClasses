package com.practiceInterview;

public class Upcust {

    public void methodA(){
        System.out.println("Parent method");
    }

}

class Child extends Upcust{

    @Override
    public void methodA(){
        System.out.println("child method");
    }
}

class test{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.methodA();

//        Upcust obj1 = new Upcust();
//        obj1.methodA();
    }
}