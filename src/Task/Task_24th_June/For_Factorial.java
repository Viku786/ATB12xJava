package Task.Task_24th_June;

import java.util.Scanner;

public class For_Factorial {
    public static void main(String[] args) {

        /*
        11. Calculate the factorial of a number using a for loop:
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Factorial using For loop ");

        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}
