package Task.Task_20th_June;

import java.util.Scanner;

public class Prime_Check {
    public static void main(String[] args) {

        //12) Check if a Number is Prime

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <=1){
            isPrime = false;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i ==0){
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
    }
}
