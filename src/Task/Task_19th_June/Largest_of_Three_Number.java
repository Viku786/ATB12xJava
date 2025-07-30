package Task.Task_19th_June;

import java.util.Scanner;

public class Largest_of_Three_Number {
    public static void main(String[] args) {

        //6) Find the Largest of Three Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter Third number: ");
        int c = sc.nextInt();

        // All three are equal
        if (a == b && b == c) {
            System.out.println("All three numbers are equal: " + a);
        }
        // Two numbers are equal and largest
        else if (a == b && a > c) {
            System.out.println("Largest: " + a + " (a and b are equal)");
        } else if (a == c && a > b) {
            System.out.println("Largest: " + a + " (a and c are equal)");
        } else if (b == c && b > a) {
            System.out.println("Largest: " + b + " (b and c are equal)");
        }
        // All different
        else if (a > b && a > c) {
            System.out.println("The first number "+a+ " is Largest number");
        } else if (b > a && b > c) {
            System.out.println("The second number "+b+ " is Largest number");
        } else {
            System.out.println("The third number "+c+ " is Largest number");
        }
    }
}
