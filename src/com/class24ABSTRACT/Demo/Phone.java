package com.class24ABSTRACT.Demo;

public abstract class Phone {

    //implemented methods
    public void call(){
        System.out.println("Phone can makes call");
    }

    public  void text(){
        System.out.println("Phone can send text");
    }

    //uniplemented methods=undefined method = abstract method
    public abstract void takePicture();

    public  abstract  void playMusic();
}
