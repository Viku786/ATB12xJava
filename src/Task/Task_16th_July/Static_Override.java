package Task.Task_16th_July;

public class Static_Override {
    public static void main(String[] args) {

        Parent.display();
        child.display();
    }
}

class Parent{
    static void display(){
        System.out.println("Parent static method");
    }
}

class child extends Parent{
    static void display(){
        System.out.println("Child static method");
    }
}