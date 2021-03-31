package com.class22.Task03;

public class Programming {

    Programming(){
        System.out.println("I love programming languages");
    }


    Programming(String a){
        System.out.println("I love " + a);
    }

    public static void main(String[] args) {

        Programming obj1 = new Programming();
        Programming obj2 = new Programming("JAVA");
    }
}
