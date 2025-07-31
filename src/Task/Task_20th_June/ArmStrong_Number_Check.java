package Task.Task_20th_June;

import java.util.Scanner;

public class ArmStrong_Number_Check {
    public static void main(String[] args) {

        //16) Check if a Number is an Armstrong Number.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int original_num = num;
        int result = 0;

        // Count no. of digit
        int n = 0;
        int temp = num;
        while (temp > 0){
            temp = temp / 10;
            n++;
        }

        temp = num;
        while (temp > 0){
            int digit = temp % 10;
            result += Math.pow(digit,n);
            temp = temp / 10;
        }

        if (original_num == result){
            System.out.println(original_num + " Is Armstrong Number");
        }
        else {
            System.out.println(original_num + " Is not Armstrong Number");
        }
    }
}
