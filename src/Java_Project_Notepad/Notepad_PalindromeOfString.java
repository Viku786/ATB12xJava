package Java_Project_Notepad;


import java.util.Scanner;

public class Notepad_PalindromeOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        String reversed="";

        for(int i = str.length() - 1; i >= 0; i--){
            reversed +=str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }

}
