package com.class19;

public class Task2 {
    String name;
    int sub1;
    int sub2;
    int sub3;
    int grade;

    public Task2(String name, int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    int average() {
        grade=(sub1+sub2+sub3)/3;
        System.out.println(grade);
        return grade;
    }
/*
    Write  a java program of Class Students that takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */

    public static void main(String[] args) {
        Task2 obj1=new Task2("Shah", 80,60,70);
        obj1.average();
        Task2 obj2=new Task2("ali", 100,89,70);
        obj2.average();
        Task2 obj3=new Task2("jhon", 100,100,80);
        obj3.average();
    }
}
