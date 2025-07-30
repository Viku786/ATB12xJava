package Task.Task_19th_June;

import java.util.Scanner;

public class Maximum_of_Two_Number {
    public static void main(String[] args) {

        //3) Find the Maximum of Two Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num = sc.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        if (num > num2){
            System.out.println("The first number "+num+ " is Greatest number");
        }else if (num2 > num){
            System.out.println("The second number "+num2+ " is Greatest number");
        }else {
            System.out.println("Both number "+ num +" & " +num2 + " are equals ");
        }
    }
}
