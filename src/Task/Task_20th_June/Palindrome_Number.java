package Task.Task_20th_June;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {

        //15) Check if a Number is a Palindrome.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int d_num = num;
        int reverse = 0;

        while (num > 0){
            int l_digit = num%10;
            reverse = reverse * 10+l_digit;
            num = num/10;
        }

        if (d_num == reverse){
            System.out.println(d_num + " is Palindrome number");
        }else{
            System.out.println(d_num + " is not a Palindrome number");
        }
    }
}
