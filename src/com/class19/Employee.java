package com.class19;

public class Employee {
    //break till 8:35
   private String name;
    private String empID;
    private double salary;
    private  String department;

    Employee(){
        System.out.println("Important Line1 ");
        System.out.println("important Line2 ");
        System.out.println("important Line3 ");
        System.out.println("important Line4 ");
        System.out.println("important Line5 ");
    }
    public Employee(String name) {
        this();
        //this.name = name;
        this.name=ValidateName(name);

    }

    public Employee(String name, String empID) {
        //this.name = name;
       // this.name=ValidateName(name);
        this(name);
        this.empID = empID;

    }
    public Employee(String name, String empID, double salary) {
       /* //this.name = name;
        this.name=ValidateName(name);
        this.empID = empID;*/
       this();
        this.salary = salary;
    }

   public Employee(String name, String empID, double salary, String department) {
    /*    //this.name = name;
       this.name=ValidateName(name);
        this.empID = empID;
        this.salary = salary;*/
       this(name, empID, salary);
        this.department = department;
       //this(name, empID, salary); CE
        printInfo();
    }
    void printInfo(){
      //  this(); CE
        System.out.println("Name "+name+" Employee ID"+empID);
    }

    String ValidateName(String name){
       if(name.length()<15){
           return name;
       }else {
           return null;
       }
    }

}
