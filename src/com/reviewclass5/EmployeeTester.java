package com.reviewclass5;

public class EmployeeTester {
    public static void main(String[] args) {
         Employee evaObj=new Employee();
         evaObj.id="123";
         evaObj.name="Eva";
         evaObj.department="IT";
         evaObj.salary=150000;
          Employee saleemObj=new Employee();
          saleemObj.id="123456";
          saleemObj.name="Saleem";
          saleemObj.department="IT";
          saleemObj.salary=200000;

          Employee[] employees=new Employee[2];
          employees[0]=evaObj;
          employees[1]=saleemObj;
          /*
          write a for loop and print the values
          of Employee Objects and call the methods
           break till 09:00
           */
        for (Employee employee : employees) {
            System.out.println("emplyee id:" + employee.id);
            System.out.println("emplyee name:" + employee.name);
            System.out.println("emplyee department:" + employee.department);
            System.out.println("emplyee salary:" + employee.salary);
            System.out.println();
            employee.drink();
            employee.work();

        }



    }
}
