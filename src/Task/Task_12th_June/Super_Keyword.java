package Task.Task_12th_June;

public class Super_Keyword {
    public static void main(String[] args) {
        /*
         6. Use of super keyword Program
         Description: Use super to call parent class method.
         */
        cat c = new cat();
        c.sound();

    }
}

class animal1{
    void sound(){
        System.out.println("Animals make lot of sound");
    }
}

class cat extends animal1{
    @Override
    void sound() {
        super.sound();
        System.out.println("Cats Meows");
    }
}