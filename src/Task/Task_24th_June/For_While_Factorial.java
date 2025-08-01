package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Factorial {
    public static void main(String[] args) {

        /*
        9. Factorial of a Number
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

        System.out.println(" ");
        System.out.println("Factorial using While loop ");

        int j=1;
        int fact1 = 1;
        while (j<=num){
            fact1 = fact1*j;
            j++;
        }
        System.out.println("Factorial: "+fact1);
    }
}
