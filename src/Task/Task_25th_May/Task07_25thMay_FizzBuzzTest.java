package Task.Task_25th_May;

import java.util.Scanner;

public class Task07_25thMay_FizzBuzzTest {
    public static void main(String[] args) {

        /*
        Write a program that prints numbers from 1 to 100.
        However, for multiples of 3, print "Fizz" instead of the number, and
        for multiples of 5, print "Buzz."
        For numbers that are multiples of both 3 and 5, print "FizzBuzz."
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number between 1 to 100 : ");
        int num = sc.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("Please enter number between 1 to 100 ");
        }

        for (int i = 1;i<=num;i++) {
           if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
           else {
               System.out.println(i);
           }
        }
    }
}
