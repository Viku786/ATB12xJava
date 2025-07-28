package Ex_20_OOPS_Super_Abstraction;

public class Lab_177_Interface_P1 {
    public static void main(String[] args) {

        car1 car1 = new car1();
        car1.drive();

    }
}

class car1 implements Engine2,brakes{

    void drive(){
        applyBrake();
        startEngine();
        stopEngine();
    }

    @Override
    public void applyBrake() {
        System.out.println("Apply Brake");

    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");

    }

    public void TestEngine() {
        System.out.println("Override by Car1");
    }

}


interface brakes{
    void applyBrake();
}

interface Engine2{
    void startEngine();
    void stopEngine();

    default void TestEngine(){
        System.out.println("Concrete complete");
    }
}