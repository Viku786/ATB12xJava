package Task.Task_11th_July;

public class Program_2 {
    public static void main(String[] args) {

        /*
            Program 2: Access parent class method using super
         */

        Child1 ch = new Child1();
        ch.display();
    }
}

class Parent1 {
   void display(){
       System.out.println("This is the Parent class method.");
   }
}

class Child1 extends Parent1 {
    @Override
    void display() {
        super.display(); // calling parent method
        System.out.println("This is the Child class method.");
    }
}