package Task.Task_20th_June;

import java.util.Scanner;

public class Check_Withdrawl {
    public static void main(String[] args) {

        /* 13) ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
        Steps to Write the Program
        1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        2️⃣ Take user input for the amount they want to withdraw.
        3️⃣ Check withdrawal conditions:
        The amount should be greater than zero.
        The amount should be a multiple of 100 (common ATM rule).
        The amount should not exceed the account balance.
        4️⃣ Deduct the amount from the balance if conditions are met.
        5️⃣ Display the updated balance or an error message if the withdrawal fails.
         */

        Scanner sc = new Scanner(System.in);

        int Account_Balance = 10000;

        System.out.println("Enter the amount that you want withdraw: ");
        int withdrawl = sc.nextInt();

        if(withdrawl <=0 || withdrawl % 100 !=0 || withdrawl > Account_Balance){
            System.out.println("Invalid withdrawal. Check amount and balance.");
        }else {
            Account_Balance -=withdrawl;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + Account_Balance);
        }

    }
}
