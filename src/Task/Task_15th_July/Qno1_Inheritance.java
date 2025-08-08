package Task.Task_15th_July;

public class Qno1_Inheritance {
    public static void main(String[] args) {

        car car = new car();
        car.sound();
        car.engine();
    }
}

class Engine{
    void sound(){
        System.out.println("Engines important part of vehicles");
    }
}

class car extends  Engine{
    void engine(){
        System.out.println("Cars engine is smooth");
    }
}