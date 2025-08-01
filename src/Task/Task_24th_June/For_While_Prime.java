package Task.Task_24th_June;

import java.util.Scanner;

public class For_While_Prime {
    public static void main(String[] args) {

        /*
        10. Check if a Number is Prime
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        System.out.println("Prime number using For loop ");

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(num+ " is Prime number");
        }else {
            System.out.println(num+ " is not Prime number");
        }

        System.out.println(" ");
        System.out.println("Prime number using While loop ");

        int j = 2;
        if (num <= 1) {
            isPrime = false;
        } else {
            while (j <= num / 2) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
        }

        if (isPrime){
            System.out.println(num+ " is Prime number");
        }else {
            System.out.println(num+ " is not Prime number");
        }
    }
}
