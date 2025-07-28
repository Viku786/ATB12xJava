package Task.Task_9thJune;

public class Qno_5 {
    public static void main(String[] args) {

        /*
5) Mobile Class with Constructor Overloading
Create a class Mobile by Use constructor overloading:
First constructor → takes only brand Second constructor → takes brand and price
         */
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple",55000);
        m1.mobileDetails();
        m2.mobileDetails();

    }
}

class Mobile{
    String brand;
    double price;

    Mobile(String brand){
        this.brand=brand;
    }

    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    void mobileDetails(){
        System.out.println("Brand name : "+brand);
        if(price>0){
            System.out.println("Price of the phone is : "+price);
        }else {
            System.out.println("Price of the phone is not specified");
        }
    }

}
