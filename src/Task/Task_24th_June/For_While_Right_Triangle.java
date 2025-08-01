package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Right_Triangle {
    public static void main(String[] args) {

        /*
        12. Right-Angled Triangle
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Rows: ");
        int rows = sc.nextInt();

        System.out.println("Right-Angled Triangle using for loop");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Right-Angled Triangle using While loop");

        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
