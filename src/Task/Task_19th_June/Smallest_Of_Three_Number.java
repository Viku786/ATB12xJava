package Task.Task_19th_June;

import java.util.Scanner;

public class Smallest_Of_Three_Number {
    public static void main(String[] args) {

        //8) Find the Smallest of Three Numbers.

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
        // Two numbers are equal and smallest
        else if (a == b && a < c) {
            System.out.println("Smallest: " + a + " (a and b are equal)");
        } else if (a == c && a < b) {
            System.out.println("Smallest: " + a + " (a and c are equal)");
        } else if (b == c && b < a) {
            System.out.println("Smallest: " + b + " (b and c are equal)");
        }
        // All different
        else if (a < b && a < c) {
            System.out.println("The first number "+a+ " is Smallest number");
        } else if (b < a && b < c) {
            System.out.println("The second number "+b+ " is Smallest number");
        } else {
            System.out.println("The third number "+c+ " is Smallest number");
        }

    }
}
