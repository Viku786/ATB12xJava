package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_9 {
    public static void main(String[] args) {

        /* Create an interface "Drawable" with a method "draw()".
        Implement this interface in classes "Circle" and "Rectangle".
         */

        Circle1 c1 = new Circle1();
        c1.draw();

        Rectangle1 r1 = new Rectangle1();
        r1.draw();
    }
}

interface Drawable{
    public void draw();
}

class Circle1 implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle1 implements  Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}