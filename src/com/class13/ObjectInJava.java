package com.class13;

public class ObjectInJava {

    public static void main(String[] args) {

        MobilePhone iPhone = new MobilePhone();
        iPhone.model = "Iphone 12";
        iPhone.price = 1200;
        iPhone.make = "Apple";
        iPhone.size = 6.4;
        iPhone.color = "Black";

        MobilePhone samsung = new MobilePhone();
        samsung.model = "S21";
        samsung.price = 1000;
        samsung.make = "Samsung";
        samsung.size = 6.4;
        samsung.color = "Phantom Black";

        MobilePhone nokia = new MobilePhone();
        nokia.model = "3310";
        nokia.price = 20;
        nokia.make = "Nokia";
        nokia.size = 1.2;
        nokia.color = "Dark Blue";

    }
}
