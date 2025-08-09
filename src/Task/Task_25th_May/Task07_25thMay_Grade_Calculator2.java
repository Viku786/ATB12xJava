package Task.Task_25th_May;

import java.util.Scanner;

public class Task07_25thMay_Grade_Calculator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score;

        System.out.println("Enter the score (0 - 100): ");

        if (sc.hasNextInt()) {
            score = sc.nextInt();

            if (score >= 0 && score <= 100) {
                char grade;

                if (score >= 90) {
                    grade = 'A';
                    System.out.println(grade);
                } else if (score >= 80) {
                    grade = 'B';
                    System.out.println(grade);
                } else if (score >= 70) {
                    grade = 'C';
                    System.out.println(grade);
                } else if (score >= 60) {
                    grade = 'D';
                    System.out.println(grade);
                } else {
                    grade = 'F';
                    System.out.println(grade);
                }
            } else {
                System.out.println("Score must be between 0 and 100.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}

