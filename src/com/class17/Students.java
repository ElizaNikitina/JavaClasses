package com.class17;

import com.class15.Student;

public class Students {

    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students obj1 = new Students();
        obj1.studentName = "Eliza";
        obj1.studentID = 123456;
        numberOfStudents ++;

        Students obj2 = new Students();
        obj2.studentName = "Eliza1";
        obj2.studentID = 1234567;
        numberOfStudents ++;

        Students obj3 = new Students();
        obj3.studentName = "Eliza2";
        obj3.studentID = 12345678;
        numberOfStudents ++;

        System.out.println(numberOfStudents);

    }
}
