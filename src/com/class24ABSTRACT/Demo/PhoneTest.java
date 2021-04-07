package com.class24ABSTRACT.Demo;

public class PhoneTest {

    public static void main(String[] args) {

        Phone iphone = new Iphone();
        iphone.call();
        iphone.text();
        iphone.takePicture();
        iphone.playMusic();

        Phone samsung = new Samsung();
        samsung.call();
        samsung.text();
        samsung.takePicture();
        samsung.playMusic();


    }
}
