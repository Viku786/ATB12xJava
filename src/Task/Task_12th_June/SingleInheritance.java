package Task.Task_12th_June;

public class SingleInheritance {
    public static void main(String[] args) {

        /*
             1. Single Inheritance Program
                Description: Create a class Animal with a method sound().
                Inherit it in Dog class and override the method.
         */


        Dog d = new Dog();
        d.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}