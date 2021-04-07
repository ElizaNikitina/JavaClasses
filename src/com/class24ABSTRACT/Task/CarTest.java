package com.class24ABSTRACT.Task;

public class CarTest {

    public static void main(String[] args) {
     Vehicle tesla  = new Tesla("red", "sedan", "Y2020");
     tesla.breakCar();
     tesla.start();
     tesla.drive();
     tesla.stop();

        System.out.println("++++++");
       new Toyota("blue", "sedan", "corolla");
       new Toyota("white", "sedan", "raf4");

        System.out.println("++++++");

        new schoolBus("yellow", 2020);
        Vehicle.total();
    }
}
