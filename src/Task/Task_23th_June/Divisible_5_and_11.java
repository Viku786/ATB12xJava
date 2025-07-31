package Task.Task_23th_June;

import java.util.Scanner;

public class Divisible_5_and_11 {
    public static void main(String[] args) {

        /*
            22)  Check if a Number is Divisible by 5 and 11
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0){
            System.out.println(num + " is divisible by 5 and 11");
        }else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}
