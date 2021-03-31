package com.class22;

public class Shape {
double radius;
 Shape(double radius){
     this.radius = radius;

 }

}

class Circle extends  Shape{

    Circle(double radius) {
        super(radius);
    }

    void circleArea(){
        double result = Math.pow(radius, 2)*Math.PI;
        System.out.println(result);

        double result1= radius*radius*3.14;
        System.out.println(result1);
    }

    public static void main(String[] args) {
        Circle circleArea = new Circle(2);
        circleArea.circleArea();
    }
}
