package Task.Task_15th_July;

public class Qno3_Abstraction {
    public static void main(String[] args) {

            Shape s = new square();
            s.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing the square");
    }
}