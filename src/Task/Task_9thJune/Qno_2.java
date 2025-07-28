package Task.Task_9thJune;

public class Qno_2 {
    public static void main(String[] args) {

        /* 2. Car Class Constructor
                Define a Car class with brand, model, and price.
                Initialize using constructor and print car details.
         */

        Car s1 = new Car("BMW","7 series",550000);
        s1.display();

    }
}

class Car{
    String brand , model;
    int price;

    Car(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
}