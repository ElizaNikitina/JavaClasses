package com.class24ABSTRACT.Demo;

import com.class24ABSTRACT.Demo.Phone;

public class Samsung extends Phone {
    @Override
    public void takePicture() {
        System.out.println("Samsung takes picture");
    }

    @Override
    public void playMusic() {
        System.out.println("Samsung plays music using google store");
    }
}
