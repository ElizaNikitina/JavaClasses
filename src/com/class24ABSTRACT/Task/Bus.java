package com.class24ABSTRACT.Task;

public abstract class Bus extends Vehicle{

    int yearOfMade;
    Bus(String color, int yearOfMade) {
        super(color);
        this.yearOfMade = yearOfMade;
    }

    @Override
    void start() {
        System.out.println("Bus can start only with a key");
    }

    abstract void breakCar();
}

class schoolBus extends Bus{

    schoolBus(String color, int yearOfMade) {
        super(color, yearOfMade);
    }

    @Override
    void breakCar() {
        System.out.println("School bus has to stop on every bus stops");
    }
}
