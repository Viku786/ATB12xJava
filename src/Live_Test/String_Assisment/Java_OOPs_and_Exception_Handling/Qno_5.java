package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_5 {
    public static void main(String[] args) {

        /* Create a class "Animal" and subclasses "Dog" and "Cat".
        Override a method to make each animal make a sound.
         */

        Dog d = new Dog();
        d.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animals Make sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}