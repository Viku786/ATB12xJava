package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_8 {
    public static void main(String[] args) {

        /* Implement an abstract class "Shape" with an abstract method "getArea()".
         Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
         */

        Shape rectangle = new Rectangle(5,3);
        System.out.println("Rectangle Area: "+rectangle.getArea());

        Shape circle = new Circle(4,3.14);
        System.out.println("Circle Area: "+circle.getArea());
    }
}

abstract class Shape{

    abstract double getArea();
}

class Rectangle extends Shape{

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length * breadth;
    }
}

class Circle extends Shape{

    int radius;
    double pi;

    public Circle(int radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public double getArea(){
        return pi * radius * radius;
    }
}