package Task.Task_31st_May;

import java.util.Scanner;

public class Qn_5 {
    public static void main(String[] args) {

        //⚠️ String is a Palindrome

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String text = sc.nextLine();

        text = text.toLowerCase();

        String reverse = "";

        for (int i = text.length()-1; i >=0 ; i--) {
            reverse = reverse+text.charAt(i);
        }

        if (text.equals(reverse)){
            System.out.println("Given String is Palindrome -> "+reverse);
        }
        else {
            System.out.println("Given String is not a Palindrome -> "+reverse);
        }
    }
}
