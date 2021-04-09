package com.class26ENCAPSULATION;

public class EncapsulationTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("eliza");
        System.out.println(emp.getName());
        emp.setAge(4);
        System.out.println(emp.getAge());
    }
}
