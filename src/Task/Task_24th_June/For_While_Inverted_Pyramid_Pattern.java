package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Inverted_Pyramid_Pattern {
    public static void main(String[] args) {

        /*
        15. Inverted_Pyramid_Pattern
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Pyramid Pattern using For loop");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Newline after each row
        }

        System.out.println();
        System.out.println("Pyramid Pattern using While loop");

        int i = rows;
        while (i >= 1) {
            int space = 1;
            while (space <= rows - i) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <= (2 * i - 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            i--;
        }
    }
}
