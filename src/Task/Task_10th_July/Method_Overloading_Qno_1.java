package Task.Task_10th_July;

public class Method_Overloading_Qno_1 {
    public static void main(String[] args) {

        /* 🔹 Task 1: Add Two Numbers
            Title: Overload a method to add different types of numbers
            Description:
            Create a class Calculator with two overloaded methods
            add(int a, int b) and add(double a, double b).
            The int version should add two integers.
            The double version should add two decimal numbers.
            In the main method, call both versions to demonstrate how overloading works
             with data types.
         */

        Calculator c = new Calculator();
        c.add(23,35);
        c.add(23,35.65);
    }
}

class Calculator{
    void add(int a , int b){
        System.out.println("Add of two integer: "+(a+b));
    }

    void add(double a,double b){
        System.out.println("Add of two double: "+(a+b));
    }
}