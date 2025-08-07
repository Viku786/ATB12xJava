package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_11 {
    public static void main(String[] args) {

        /* Write a program to demonstrate method overloading by creating multiple
        "add" methods with different parameters.
         */

        Add a = new Add();
        System.out.println("Integer addition: "+a.add(5,3));
        System.out.println("Double addition: "+a.add(2.5,3.7));
        System.out.println("Three integers addition: "+a.add(1,2,3));
    }
}

class Add{

    public int add(int a , int b){
        return a + b;
    }

    public double add (double a, double b){
        return a + b;
    }

    public int add (int a, int b, int c){
        return a + b + c;
    }
}