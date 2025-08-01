package Task.Task_9th_July;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {

        /* ✅ Task 2: "Vehicle Constructor Chain"
        📄 Description:
            Create a class Vehicle with a constructor that prints "Vehicle is ready".
            Create a class Bike that extends Vehicle and prints "Bike is ready"
            in its constructor.
            Create an object of Bike in the main method and observe
            constructor call order.
         */
        Bike b = new Bike();
        //Note: Constructor of parent class always runs before child class constructor.
    }
}

class Vehicle{
    public Vehicle() {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    public Bike() {
        System.out.println("Bike is ready");
    }
}