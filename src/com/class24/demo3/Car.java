package com.class24.demo3;

public class Car {
   void start(){
       System.out.println("Use the key to start me");
   }
   void stop(){
       System.out.println("use the breaks t stop me");
   }
   void park(){
       System.out.println("Park me manually");
   }
}

class  BMW extends Car{
    void start(){
        System.out.println("Use the Button to start me");
    }
    void drifting(){
        System.out.println("i can drift really good in rain");
    }
}

class Tesla extends Car{
    void start(){
        System.out.println("Use App to start me");
    }

    void park(){
        System.out.println("Park me using sensor and camera");
    }
}

class Toyota extends Car{

}
