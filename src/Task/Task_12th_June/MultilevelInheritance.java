package Task.Task_12th_June;

public class MultilevelInheritance {
    public static void main(String[] args) {
        /*
            2. Multilevel Inheritance Program
            Description: Create class Grandparent → Parent → Child and
            demonstrate multilevel inheritance.
         */
            Child ch = new Child();
            ch.displayC();
            ch.displayP();
            ch.displayGP();
    }
}

class Grandparent{
    void displayGP(){
        System.out.println("I am Grandparent");
    }
}

class Parent extends Grandparent{
    void displayP() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    void displayC(){
        System.out.println("I am child");
    }
}