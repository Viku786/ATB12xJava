package Task.Task_8th_June;

public class Qno_1_AllConcept {
    public static void main(String[] args) {

        // Object of SBI
        ICICI iciciAccount = new ICICI();
        iciciAccount.createAccount("Vikash");
        iciciAccount.setBalance(5000);
        iciciAccount.printBankDetails();

        System.out.println("-----------");

        // Method Overloading
        HDFC hdfcAccount = new HDFC();
        hdfcAccount.createAccount("Vicky", 10000);
        hdfcAccount.printBankDetails();

        System.out.println("-----------");

        // Polymorphism (runtime)
        Bank ref;
        ref = new ICICI();
        System.out.println("Interest from polymorphic SBI reference: " + ref.getInterestRate());

        ref = new HDFC();
        System.out.println("Interest from polymorphic HDFC reference: " + ref.getInterestRate());

    }
}

// Parent class (Base)
class Bank {
    private String accountHolderName;
    private double balance;

    // Encapsulation: Getters and Setters
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to be overridden
    public double getInterestRate() {
        return 0;
    }

    // Method Overloading
    public void createAccount(String name) {
        this.setAccountHolderName(name); // this keyword
        this.setBalance(0.0);
        System.out.println("Account created for " + this.accountHolderName + " with balance " + this.balance);
    }

    public void createAccount(String name, double initialDeposit) {
        this.setAccountHolderName(name);
        this.setBalance(initialDeposit);
        System.out.println("Account created for " + this.accountHolderName + " with balance " + this.balance);
    }
}

// Child class using Single Inheritance and Overriding
class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 8.5;
    }

    public void printBankDetails() {
        System.out.println("Bank: ICICI");
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + this.getInterestRate());
    }
}

// Another child class of Bank
class HDFC extends Bank {
    @Override
    public double getInterestRate() {
        return super.getInterestRate() + 9.5; // Using super
    }

    public void printBankDetails() {
        System.out.println("Bank: HDFC");
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + this.getInterestRate());
    }
}