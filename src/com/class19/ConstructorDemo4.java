package com.class19;

public class ConstructorDemo4 {

    String name;
 ConstructorDemo4(){

    }

   private ConstructorDemo4(String name){
        System.out.println(" parameterized constructor");
       // this.name=name;
    }


    void printName(){
        System.out.println("Ayob");
    }

    public static void main(String[] args) {
        ConstructorDemo4  ob1=new ConstructorDemo4();
        new ConstructorDemo4("Alec");

        ob1.printInfo();

    }
    void printInfo(){
        printName();
        System.out.println(name);
    }


}
