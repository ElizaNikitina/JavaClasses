package com.reviewClass;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee evaObj = new Employee();
        evaObj.id = "12345";
        evaObj.name = "Eva";
        evaObj.department = "IT";
        evaObj.salary = 150000;

        Employee salemObj = new Employee();
        salemObj.name = "Salem";
        salemObj.department = "IT";
        salemObj.salary = 200000;
        salemObj.id = "123456";

        Employee[] employees = new Employee[2];
        employees[0] = evaObj;
        employees[1] = salemObj;

        for(Employee emp : employees){
            emp.work();
            emp.drink();
        }

    }
}
