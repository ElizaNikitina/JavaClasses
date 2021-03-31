package com.class21.demo1;

public class ChildClass extends ParentClass{

    int field1;
    public ChildClass(int field1, int field2, int field3, int field4, int field5, int field6, int field7) {
        super(field1, field2, field3, field4, field5, field6, field7);
        System.out.println("Child class constructor is called");
        super.field1=12;
        this.field1=13;
    }
}
