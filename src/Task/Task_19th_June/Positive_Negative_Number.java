package Task.Task_19th_June;

import java.util.Scanner;

public class Positive_Negative_Number {
    public static void main(String[] args) {

        //1) Check if a Number is Positive or Negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("The enter number " +num+ " neither positive nor negative number");
        } else if (num > 0) {
            System.out.println("The enter number " +num+ " is Positive Number");
        }
        else {
            System.out.println("The enter number " +num+ " is Negative Number");
        }
    }
}
