package com.class24.demo3;

public class CarTester {

    public static void main(String[] args) {

        Car car1=new BMW();
        car1.start(); //method from child will be called because we have over written it
        car1.stop();  //method from Parent will be called because we have not over written it
      //  car1.drifting(); //CE not allowed by busing parent reference

        BMW bmw1=(BMW) car1; //because now we have converted our refeence back to BMW we can call all the methods
        bmw1.drifting();

        Car car=new Tesla();
        BMW bmw2=(BMW) car;

        BMW bmw= new BMW();

       //BMW bmw3=new Tesla();


    }
}
