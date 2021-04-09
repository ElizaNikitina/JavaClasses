package com.class26ENCAPSULATION.Task01;

public class DoctorTest {

    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.setEmail("");
        System.out.println(doc.getEmail());
        doc.setEmail("hak");
        System.out.println(doc.getEmail());
        doc.setEmail("hak@gmail.com");
        System.out.println(doc.getEmail());


    }
}
