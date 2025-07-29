package Task.Task_14th_June;

public class Abstract_Animal {
    public static void main(String[] args) {
        /*
        1. Animal Sound - Abstract Method Implementation
        Description: Create an abstract class Animal with an abstract method makeSound().
         Extend it in Dog and Cat.
         🔶 Expected Output:
            Dog barks
            Cat meows
         */
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();

    }
}

abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}