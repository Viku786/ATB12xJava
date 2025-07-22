package Java_Project_Notepad;

import java.util.Scanner;
public class Notepad_ReverseOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        String reversed="";

        for(int i = str.length() - 1; i >= 0; i--){
            reversed +=str.charAt(i);
        }

        System.out.println("Reverse of string is " +reversed);
    }
}
