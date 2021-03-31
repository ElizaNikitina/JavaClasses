package com.class22;

public class SuperAndStatic {
    String color;

    static void printInfo(){
       // super.color = "red"; why CE error
       // this.color = "red"; why CE error
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic = new SuperAndStatic();
        superAndStatic.color = "Red";
        SuperAndStatic superAndStatic1 = new SuperAndStatic();
        superAndStatic1.color = "White";
        SuperAndStatic superAndStatic2 = new SuperAndStatic();
        superAndStatic2.color = "Black";

        SuperAndStatic.printInfo();
    }

}

class parent{
    String color;

}