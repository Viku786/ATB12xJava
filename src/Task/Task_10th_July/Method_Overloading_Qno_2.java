package Task.Task_10th_July;

public class Method_Overloading_Qno_2 {
    public static void main(String[] args) {

        /* 🔹 Task 2: Print Data
            Title: Create a universal printer with overloading
            Description:
            Create a class Printer with multiple printData() methods
            to handle different data types:
            printData(String data)
            printData(int data)
            printData(float data)
            Demonstrate in the main() method how the same method name
            behaves differently depending on the parameter type.
         */

        Printer p = new Printer();
        p.printData(12);
        p.printData(12.65);
        p.printData("12.78");
    }
}

class Printer{
    void printData(String data){
        System.out.println("String printed: "+data);
    }

    void printData(int data){
        System.out.println("Integer printed: "+data);
    }

    void printData(double data){
        System.out.println("Double printed: "+data);
    }
}