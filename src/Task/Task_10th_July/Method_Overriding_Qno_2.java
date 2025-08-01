package Task.Task_10th_July;

public class Method_Overriding_Qno_2 {
    public static void main(String[] args) {

        /* 🔹 Task 2: Vehicle Start
            Title: Demonstrate engine start behavior using overriding
            Description:
            Create a base class Vehicle with a method start().
            Create Bike and Car classes that override the start() method:
            Bike prints "Kick start the bike"
            Car prints "Turn the key to start the car"
            This shows how polymorphism works with method overriding.
         */

        Vehicle v;

        v = new Bike();
        v.start();

        v= new Car();
        v.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicles starting");
    }
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}