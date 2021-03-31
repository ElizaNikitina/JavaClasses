package com.class20;

public class Cat extends Animal {
    Cat(String name){
        this.name=name;
    }
    void run(){
        System.out.println(name+" is running");
    }
    void walk(){
        System.out.println(name +" is walking");
    }

    void meow(){
        System.out.println(name+"meowing meowing");
    }

}
