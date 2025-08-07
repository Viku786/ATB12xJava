package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_4 {
    public static void main(String[] args) {

        /* Create a BankAccount class with private balance field.
        Implement deposit(), withdraw(), and getBalance() methods with
         proper validation.
        Explanation:Implement proper encapsulation with validation to prevent
        invalid operations like negative deposits or insufficient balance withdrawals.
         */

        BankAccount ba = new BankAccount(100000);

        ba.deposit(10000);
        ba.withdraw(50000);
        ba.getBalance();
        System.out.println("Balance After Withdrawl: "+ba.getBalance());

        System.out.println("------------");
        ba.deposit(-100.0); // Invalid deposit
        ba.withdraw(2000000.0); // Invalid withdrawal (insufficient funds)
        ba.withdraw(-50.0); // Invalid withdrawal (negative amount)
    }
}

class BankAccount{
    private double balance;

    public BankAccount (double InitialBalance){
        if(InitialBalance >= 0){
            this.balance = InitialBalance;
        }else {
            System.out.println("Initial Balance can't be negative: ");
            this.balance = 0.0;
        }
    }

    public void deposit(double amount){
        if(amount > 0 ){
            balance +=amount;
        }else {
            System.out.println("Deposit amount should be positive");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
        }else if (amount <= 0){
            System.out.println("Withdrawl amount should be positive");
        }else {
            System.out.println("Insufficient balance for withdrawl");
        }
    }

    public double getBalance() {
        return balance;
    }
}