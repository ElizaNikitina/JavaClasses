package com.class22.SuperKewordDemo03;

class GrandParent{
    String color="White";
    void print(){
        System.out.println(color);
    }
}

class parent extends GrandParent{
     String color="Black";
    void print(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
public class GrandChild extends parent {
    String color="Red";
    void printInfo(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();

        System.out.println("======");
        grandChild.print();
    }
}