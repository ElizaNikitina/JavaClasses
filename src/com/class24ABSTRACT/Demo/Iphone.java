package com.class24ABSTRACT.Demo;

public class Iphone extends Phone {


    @Override
    public void takePicture() {
        System.out.println("Iphone takes picture");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone plays music using apple store");
    }
}
