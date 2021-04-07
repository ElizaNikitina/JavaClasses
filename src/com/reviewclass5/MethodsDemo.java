package com.reviewclass5;

public class MethodsDemo {
    /*
    Return types
    void if methods does not return any type we use void
     */
    void simpleMethod(){
        System.out.println("How are your");
        // widely used
    }

    int simpleIntMethod(){
        return 10;
    }

    void onlyTakesInput(int x){
        System.out.println(x);
    }
    void methodWithTwoInputs(String name,double salary){
        System.out.println(name+" earns "+salary);
    }
    int sum(int num1,int num2){
        return num1+num2; // widely used
    }

   boolean isNumberPositive(int number){
       return number > 0;
   }
}
