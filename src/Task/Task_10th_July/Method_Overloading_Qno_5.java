package Task.Task_10th_July;

public class Method_Overloading_Qno_5 {
    public static void main(String[] args) {

        /*  Task 5: Find Maximum
            Title: Find max using overloaded functions
            Description:
            Create a class Utility with two methods named max():
            max(int a, int b) returns the larger of two integers
            max(int a, int b, int c) returns the larger of three integers
            max(double a, double b) returns the larger of two decimal values
            Add method calls in main() to compare different types.
         */
            Utility u = new Utility();
        System.out.println("Max of two Integer: "+u.max(55,65));
        System.out.println("Max of two double; "+u.max(45.67,45.68));
        System.out.println("Max of three number: "+u.max(75,45,55));
    }
}

class Utility{
    int max(int a, int b){
        return (a>b)?a:b;
    }

    int max(int a, int b, int c){
        return Math.max(a , Math.max(b,c));
    }

    double max(double a, double b){
        return (a>b)?a:b;
    }
}