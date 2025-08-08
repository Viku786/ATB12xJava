package Task.Task_15th_July;

public class Qno2_Encapsulation {
    public static void main(String[] args) {

        Account ac = new Account();
        ac.deposit(5000);
        System.out.println(ac.getBalance());
    }
}

class Account{
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance +=amount;
        }
    }
}