package com.class22.SuperKeyWordDemo2;

public class DogClass extends  Animal{

    String breed;

    DogClass(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = breed;
        System.out.println("parametrized Child");
    }

    void printInfo(){
        System.out.println(name + " name " + age + " age " + breed + "breed");
    }

   public DogClass(){

        System.out.println("Dog Child");
    }
}
