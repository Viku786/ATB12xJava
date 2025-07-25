package Task_31st_May;

import java.util.Scanner;

public class Qn_3 {
    public static void main(String[] args) {

        //Write a program to reverse a string without using a loop
        // without using an inbuilt function. -> recursive functions

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.next();

        String reversed = reverse(text);
        System.out.println("Reverse of the String : "+reversed);
    }
     static String reverse(String str){
        if (str == null || str.length()<=1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
