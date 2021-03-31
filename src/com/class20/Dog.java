package com.class20;

public class Dog extends Animal {

    Dog(String name){
        this.name=name;
    }
        void run(){
        System.out.println(name+" is running");
    }
    void walk(){
        System.out.println(name +" is walking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }


}
