package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Inverted_Right_Triangle {
    public static void main(String[] args) {

        /*
        13. Inverted Right-Angled Triangle
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Rows: ");
        int rows = sc.nextInt();

        System.out.println("Inverted Right-Angled Triangle using for loop");

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Inverted Right-Angled Triangle using While loop");

        int i = rows;
        while (i >=1 ) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
