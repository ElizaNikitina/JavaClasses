package com.class26ENCAPSULATION.Task02;

public class RegistrationTest {

    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.setEmail("hhhh@gmail.com");
        System.out.println(reg.getEmail());

        reg.setUserName("ElizaNikitina");
        System.out.println(reg.getUserName());

        reg.setPassword("Eliza");
        System.out.println(reg.getPassword());


    }
}
