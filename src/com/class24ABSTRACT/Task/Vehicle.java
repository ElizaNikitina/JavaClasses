package com.class24ABSTRACT.Task;

public abstract class Vehicle {
    static int totalVehicles;
    String color;

    Vehicle(String color){
        this.color = color;
        totalVehicles++;
    }
    public static void total(){
        System.out.println("we build " +  totalVehicles + " vehicle");
    }

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

    String cartType;
    Car(String color, String cartType){
        super(color);
        this.cartType = cartType;
    }

    abstract void start();
    void breakCar(){
        System.out.println(cartType + " breaks");
    }
}

class Tesla extends Car{
      String make;
     Tesla(String color, String cartType, String make) {
        super(color, cartType);
        this.make = make;
    }

    @Override
    void start() {
        System.out.println(make + "can starts remotly with your phone");
    }

    @Override
    void drive(){
        System.out.println(make + " can drive by itself");
    }
}

class Toyota extends Car{

    String make;
    Toyota(String color, String carType, String make) {
        super(color, carType);
        this.make = make;
    }
    @Override
    void start() {
        System.out.println(make + " You need a key to start your toyota");
    }
}
