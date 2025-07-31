package Task.Task_20th_June;

import java.util.Scanner;

public class Eligible_For_Loan {
    public static void main(String[] args) {

        /* 17)  Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
         * Take the below User info and store it into the variables:
         * Age (integer)
         * Salary (double or float)
         * Credit Score (integer)
            Age Validation:
            :- Check if the age is a positive integer.
            :- Ensure the age is at least 18 years old.
            :- Max age can be 80.
            Salary Validation:
            :- Check if the salary is a positive number.
            :- Define a minimum salary threshold (e.g., 30,000).
            Credit Score Validation:
            :- Check if the credit score is a positive integer.
            :- Define a minimum credit score threshold (e.g., 650).
            :- Max credit score threshold (e.g., 850).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        System.out.println("Enter the Salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter the Credit Score : ");
        int credit_Score = sc.nextInt();

        if(age<=0 || salary <=0 || credit_Score <=0){
            System.out.println("Please enter Positive Number greater than Zero");
        }
        else if (age >= 18 && age <= 80 && salary >= 30000 && credit_Score >= 650 && credit_Score <= 850) {
            System.out.println("Eligible for loan.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}
