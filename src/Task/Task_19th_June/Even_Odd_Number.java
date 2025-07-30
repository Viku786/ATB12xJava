package Task.Task_19th_June;

import java.util.Scanner;

public class Even_Odd_Number {
    public static void main(String[] args) {

        //2)Check if a Number is Even or Odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();;

        if (num % 2 == 0) {
            System.out.println("Enter number " + num + " is Even number");
        } else {
            System.out.println("Enter number " + num + " is Odd number");
        }
    }
}
