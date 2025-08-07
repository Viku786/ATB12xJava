package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_6 {
    public static void main(String[] args) {

        /* Create a Vehicle base class with start() method.
        Create Car and Bike subclasses that override the start() method.
         */
        Vehicle[] vehicles = {new Car(), new Bike()};

        for (Vehicle v : vehicles){
            v.start();
        }
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle start with a sound");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}
