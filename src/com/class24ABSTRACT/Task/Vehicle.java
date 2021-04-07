package com.class24ABSTRACT.Task;

public abstract class Vehicle {

    void drive(){
        System.out.println("Vehicle can be drive");
    }

    void stop(){
        System.out.println("Vehicle can stop");
    }

    abstract void start();
    abstract void breakCar();

}

abstract class Car extends Vehicle{

    abstract void start();
    void breakCar(){
        System.out.println("Car breaks");
    }
}

class Tesla extends Car{

    @Override
    void start() {

    }
}
