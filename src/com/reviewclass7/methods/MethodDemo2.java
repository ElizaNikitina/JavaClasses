package com.reviewclass7.methods;

public class MethodDemo2 {
    static void methodWithStaticModifier(){
        System.out.println("you can call me by just writing the name of the class");
        //instanceMethod(); need to create the object of this class
    }
    void instanceMethod(){
        System.out.println("You need an object of my class if you want to call me outside of this" +
                "class or in the static methods");
        methodWithStaticModifier(); //i can call it because static members belong to the class not instance/object
    }

    void instanceMethod2(){
       methodWithStaticModifier();
       instanceMethod();
       String [] a={"bla bla"};
       main(a);
    }
    public static void main(String[] args) {
        methodWithStaticModifier();

    }
}
