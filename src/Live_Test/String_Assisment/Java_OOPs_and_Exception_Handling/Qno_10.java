package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_10 {
    public static void main(String[] args) {

        /* Create interfaces "Flyable" and "Swimmable" with appropriate methods.
         Implement both in a "Duck" class.
         */

        Duck d = new Duck();
        d.Flyable();
        d.Swimmable();
    }
}

interface Flyable{

    public void Flyable();
}

interface Swimmable{
    public void Swimmable();
}

class Duck implements Flyable,Swimmable{

    public void Flyable(){
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void Swimmable() {
        System.out.println("Duck is swimming in the water!");
    }
}