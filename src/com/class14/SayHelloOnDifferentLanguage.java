package com.class14;

public class SayHelloOnDifferentLanguage {

    public String sayHello(String language){

        String hello=null;
        switch (language){
            case "russian":
                hello = "Привет";
                break;
            case "english":
                hello = "hello";
                break;
            case "germany":
                hello = "ola";
                break;
            case "spanish":
                hello = "hola";
                break;
        }


        return hello;
    }

    public static void main(String[] args) {
        SayHelloOnDifferentLanguage obj = new SayHelloOnDifferentLanguage();

        System.out.println(obj.sayHello("germany"));
    }
}
