package Task.Task_12th_June;

public class Constructor_in_Inheritance {
    public static void main(String[] args) {

        /*
        4. Constructor in Inheritance Program
            Description: Show how constructors of parent and child classes are called.
         */

        child c = new child();
    }
}
class parent{
    parent(){
        System.out.println("Parent class constructor");
    }
}

class child extends parent{
     child() {
        System.out.println("Child class constructor");
    }
}