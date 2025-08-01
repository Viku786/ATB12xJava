package Task.Task_10th_July;

public class Method_Overriding_Qno_1 {
    public static void main(String[] args) {

        /* 🔹 Task 1: Animal Sounds
            Title: Override sound behavior in subclasses
            Description:
            Create a base class Animal with a method sound().
            Create subclasses Dog, Cat, and Cow, each overriding sound()
            to return “Bark”, “Meow”, and “Moo” respectively.
            Create an object of each class and call sound()
            to see how overriding provides different outputs using the same method name.
         */

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animals makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    @Override
    void sound() {
        System.out.println("Moo");
    }
}