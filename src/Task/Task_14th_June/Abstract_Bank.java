package Task.Task_14th_June;

public class Abstract_Bank {
    public static void main(String[] args) {
        /*
        2. Bank Interest Calculation
        Description: Abstract class Bank with abstract method getInterestRate().
        Classes SBI and HDFC implement it.
        🔶 Expected Output:
        SBI Interest Rate: 6.5%
        HDFC Interest Rate: 7.0%
         */
        SBI s = new SBI();
        s.getInterestRate();
        HDFC h = new HDFC();
        h.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{
    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{
    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}