package com.class15;

public class Student {

    String name;
    int age;
    String studentId;
    String schoolName;

    void study(){
        System.out.println(name + " studies in " + schoolName);
    }

    void payTuition(){
        System.out.println(name + " pays the tuition");
    }


    public static void main(String[] args) {

        Student ramObj = new Student();

        ramObj.schoolName = "Syntax";
        ramObj.name = "Ram";
        ramObj.age = 25;
        ramObj.studentId = "CS123";
        ramObj.study();
        ramObj.payTuition();
    }
}
