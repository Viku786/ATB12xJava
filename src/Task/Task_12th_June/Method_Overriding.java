package Task.Task_12th_June;

public class Method_Overriding {
    public static void main(String[] args) {
        /*
        5. Method Overriding in Inheritance Program
        Description: Demonstrate how method overriding works.
         */

        animal a = new dog(); //Upcasting
        a.sound();
    }
}
class animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}

class dog extends animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}