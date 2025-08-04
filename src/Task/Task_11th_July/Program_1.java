package Task.Task_11th_July;

public class Program_1 {
    public static void main(String[] args) {

        /*
        Program 1: Access parent class constructor using super()
         */

        Child ch = new Child();
    }
}

class Parent {
    Parent() {
        System.out.println("This is the parent constructor.");
    }
}

class Child extends Parent {
    Child() {
        super(); // calling parent class constructor
        System.out.println("This is the child constructor.");
    }
}
