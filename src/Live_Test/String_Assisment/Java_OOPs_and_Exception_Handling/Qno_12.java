package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_12 {
    public static void main(String[] args) {

        /* Write a program to demonstrate method overriding by
        creating parent and child classes with the same method signature.
         */

        Parent p = new Parent();
        p.display();

        Child ch = new Child();
        ch.display();
    }
}

class Parent{
    void display(){
        System.out.println("Parent class display method");
    }
}

class Child extends Parent{
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}