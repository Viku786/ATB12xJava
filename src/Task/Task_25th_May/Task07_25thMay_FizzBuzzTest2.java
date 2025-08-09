package Task.Task_25th_May;

import java.util.Scanner;

public class Task07_25thMay_FizzBuzzTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter a number between 1 and 100: ");

        if (sc.hasNextInt()) {
            num = sc.nextInt();

            if (num >= 1 && num <= 100) {
                for (int i = 1; i <= num; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Number must be between 1 and 100.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
