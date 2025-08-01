package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Multiplication_Table {
    public static void main(String[] args) {

        /*
        8. Multiplication Table of a Given Number (take the input from user).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Table using For loop ");
        for (int i = 1; i < 11 ; i++) {
            System.out.print(" "+num*i);
        }

        System.out.println(" ");
        System.out.println("Table Using While Loop ");

        int j = 1;
        while (j < 11){
            System.out.print(" "+num*j);
            j++;
        }
    }
}
