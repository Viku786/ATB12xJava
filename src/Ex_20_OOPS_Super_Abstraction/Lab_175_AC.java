package Ex_20_OOPS_Super_Abstraction;

public class Lab_175_AC {
    public static void main(String[] args) {

        WagonR car = new WagonR();
        car.driver();

    }
}

class WagonR extends Engine{

    void driver(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Engine Start!!");
    }
}

abstract class Engine{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("Engine stopped");
    }
}