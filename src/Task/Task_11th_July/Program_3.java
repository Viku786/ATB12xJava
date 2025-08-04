package Task.Task_11th_July;

public class Program_3 {
    public static void main(String[] args) {

        /*
        Program 3: Access parent class variable using super
         */

        Child2 ch = new Child2();
        ch.show();
    }
}

class Parent2 {
    int number = 100;
}

class Child2 extends Parent2 {
    int number = 200;

    void show() {
        System.out.println("Child number: " + number);
        System.out.println("Parent number: " + super.number);
    }
}