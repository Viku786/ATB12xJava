package Ex_20_OOPS_Super_Abstraction;

public class Lab_176_Interface {
    public static void main(String[] args) {

        WagonR1 car = new WagonR1();
        car.driver();

    }
}

class WagonR1 extends Engine1 implements Tyre,gear{

    void driver(){
        rubberTyre();
        blackColor2Tyre();
        startEngine();
        changeGear();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Engine Start!!");
    }

    @Override
    public void rubberTyre() {
        System.out.println("It is of Rubber Tyre");

    }

    @Override
    public void blackColor2Tyre() {
        System.out.println("There is 2 black tyre");

    }

    @Override
    public void m1() {

    }

    @Override
    public void changeGear() {
        System.out.println("Driver able to change the gear");

    }
}

abstract class Engine1{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("Engine stopped");
    }
}

interface Tyre{
    //We have only incomplete fuction
    void rubberTyre();
    void blackColor2Tyre();

    // We're using complete function through default and static after JDK>11

    default void m1(){

    }

    static void m2(){

    }
}

interface gear{
    void changeGear();
}