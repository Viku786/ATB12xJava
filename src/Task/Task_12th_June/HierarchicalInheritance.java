package Task.Task_12th_June;

public class HierarchicalInheritance {
    public static void main(String[] args) {

        /*
            3. Hierarchical Inheritance Program
            Description: Create a base class Vehicle.
            Derive classes Car and Bike from it.
         */
        Car c = new Car();
        c.start();
        c.tyre();

        System.out.println("-------------");

        Bike b = new Bike();
        b.start();
        b.tyre();

    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicles Start");
    }
}

class Car extends Vehicle{
    void tyre(){
        System.out.println("Car has four tyres");
    }
}

class Bike extends Vehicle{
    void tyre(){
        System.out.println("Bike has two tyres");
    }
}