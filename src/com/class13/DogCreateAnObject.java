package com.class13;

public class DogCreateAnObject {

    public static void main(String[] args) {

        Dog bulldog = new Dog();
        bulldog.breed = "Bulldog";
        bulldog.size = "large";
        bulldog.color = "light gray";
        bulldog.age = 5;
        bulldog.name = "Good boy";
        bulldog.bark();
        bulldog.eat();
        bulldog.sleep();
        bulldog.name();


        Dog beagle = new Dog();
        beagle.breed = "Beagle";
        beagle.size = "large";
        beagle.color = "orange";
        beagle.age = 6;

        Dog germanShepherd = new Dog();
        germanShepherd.breed = "German Shepherd";
        germanShepherd.size = "large";
        germanShepherd.color = "white & orange";
        germanShepherd.age = 6;
    }
}
