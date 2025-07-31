package Task.Task_20th_June;

import java.util.Scanner;

public class Person_Travel {
    public static void main(String[] args) {

        /* 21)  Find if a Person Can Travel Based on Visa Status and Age.
        take the input from the user for 
        Age (integer).
        Visa Status (String or boolean).
        Check Eligibility:
        :- If age is 18 or older and visa status is valid, the person can travel.
        Otherwise, the person cannot travel.
        Validation Criteria
        Age: - Must be a non-negative integer.
        :- Should be greater than or equal to 18 to be eligible to travel.
        Visa Status :- Must be a valid string indicating the visa status 
        (e.g., "valid" or "invalid").
         :- You can also use a boolean where true indicates a valid visa and 
         false indicates an invalid visa.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int age = sc.nextInt();

        System.out.println("Enter Visa Status (valid/invalid): ");
        String visa = sc.next();
        
        if(age < 0 ){
            System.out.println("Please enter valid age");
        } else if (age >= 18 && visa.equalsIgnoreCase("valid")) {
            System.out.println("The person can travel.");
        }else {
            System.out.println("The person can not travel.");
        }
    }
}
