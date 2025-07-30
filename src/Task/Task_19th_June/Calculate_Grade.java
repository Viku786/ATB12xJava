package Task.Task_19th_June;

import java.util.Scanner;

public class Calculate_Grade {
    public static void main(String[] args) {


        /* 10) Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
        1️⃣ Take user input for marks (Use Scanner class).
        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
        3️⃣ Use if-else-if conditions to determine the grade based on marks.
        4️⃣ Display the grade as output.
        📌 Grading Criteria (Example)
        Marks Range Grade
        90 - 100   A+
        80 - 89    A
        70 - 79    B
        60 - 69    C
        50 - 59    D
        40 - 49    E
        Below 40   Fail
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score (0 - 100): ");

        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a number between 0 and 100.");
            return;
        }

        String grade;

        if (score >= 90) {
            grade = "A+";
        } else if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >=50){
            grade = "D";
        } else if (score >=40) {
            grade = "E";
        }else {
            grade = "Fail";
        }

        System.out.println("Your grade is: " + grade);
    }
}
