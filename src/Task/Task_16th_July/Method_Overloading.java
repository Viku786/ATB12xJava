package Task.Task_16th_July;

public class Method_Overloading {
    public static void main(String[] args) {

        multiply m = new multiply();
        System.out.println(m.multiply(10,20));
        System.out.println(m.multiply(10.05,10.5,10.005));

    }
}

class multiply{

    int multiply(int a, int b){
        return a*b;
    }

    double multiply(double a, double b , double c){
        return a*b*c;
    }
}