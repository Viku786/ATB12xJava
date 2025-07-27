package Task.Task_31st_May;

import java.util.Scanner;

public class Qn_2 {
    public static void main(String[] args) {

       //Write a program to reverse a string by using an inbuilt function.
        // -> StringBuffer - reverse()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.next();

        StringBuffer stringBuffer = new StringBuffer(text);
        String reversed = stringBuffer.reverse().toString();

        System.out.println("Reversed of the String : "+reversed);

    }
}
