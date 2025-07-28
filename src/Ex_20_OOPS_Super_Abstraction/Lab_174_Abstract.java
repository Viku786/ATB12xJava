package Ex_20_OOPS_Super_Abstraction;

public class Lab_174_Abstract {
    public static void main(String[] args) {

        son s1 = new son();
        s1.loan_50k();

        // Father f1 = new Father(); -> Abstract class cannot Instantiate
    }
}

class Normal{
    //Concrete class -> Complete class
}

abstract class Father{
    abstract void loan_50k();
}

class son extends Father{

    @Override
    void loan_50k() {
        System.out.println("Loan Paid!!");
    }
}