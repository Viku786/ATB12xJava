package Task.Task_23th_June;

import java.util.Scanner;

public class Checked_Senior_Citizen {
    public static void main(String[] args) {

        /* 25)  Find if a Person is Senior Citizen Based on Age.
         :- take the age input from the user.
            Implement Age Category Logic:
            Define the criteria for different age categories:
            Child: Age 0 to 12
            Teenager: Age 13 to 19
            Adult: Age 20 to 64
            Senior Citizen: Age 65 and older
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age <= 64) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }
    }
}
