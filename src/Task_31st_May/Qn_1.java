package Task_31st_May;

import java.util.Scanner;

public class Qn_1 {
    public static void main(String[] args) {

        //Write a program to reverse a string without using inbuilt functions. -> forloop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String text = sc.next();

        // Convert string to character array manually
        char[] ch = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ch[i]=text.charAt(i);
        }

        System.out.println("Reversed of String : ");
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]);
        }
    }
}
