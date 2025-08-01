package Task.Task_10th_July;

public class Method_Overloading_Qno_3 {
    public static void main(String[] args) {

        /*  Task 3: Multiply Numbers
        Title: Multiply using overloaded methods
        Description:
        Create a class MathOperations with two multiply() methods:
        One takes two integers and returns the product
        Another takes three integers and returns their product
        This helps students understand how Java distinguishes methods
        based on parameter count.
         */

        MathOperations mathOperations = new MathOperations();
        mathOperations.multiply(45,55);
        mathOperations.multiply(25,25,25);
    }
}

class MathOperations{

    void multiply(int a,int b){
        System.out.println("Product of two number: "+(a*b));
    }

    void multiply(int a , int b, int c){
        System.out.println("Product of three number: "+(a*b*c));
    }
}