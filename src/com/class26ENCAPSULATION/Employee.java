package com.class26ENCAPSULATION;

public class Employee {

    //define private variables
    private String name;
    private int age;
    private double salary;

    //define public methods to give an access to private variables
    public String getName(){

        return name;
    }
    public void setName(String name){
        if(!name.isEmpty() && name.length()>3) {
            this.name = name;
        }else{
            System.out.println("Field cannot be empty and length has to be more then 3 characters");
        }
    }
    public  int getAge(){

        return age;
    }
    public void setAge(int age){
        if(age>18) {
            this.age = age;
        }else{
            System.out.println("You have to be older 18 years old");
        }
    }
    public  double getSalary(){
      return  salary;
    }





    public void setSalary(double salary){
        this.salary=salary;
    }
}
