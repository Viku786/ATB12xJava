package Task.Task_14th_June;

class Abstract_Constructor extends Base {
    public static void main(String[] args) {
        /* 3. Abstract Class with Constructor
        Description: Show that abstract class can have constructor.
        Print message from constructor and method.
        🔶Expected Output:
        Abstract class constructor called
        Method from abstract class
         */
        Abstract_Constructor obj = new Abstract_Constructor();
        obj.show();
    }
}

abstract class Base{
    Base(){
        System.out.println("Abstract class constructor called");
    }

    void show(){
        System.out.println("Method from abstract class");
    }
}