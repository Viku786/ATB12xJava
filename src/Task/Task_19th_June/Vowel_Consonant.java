package Task.Task_19th_June;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {

        //4) Check if a Character is a Vowel or Consonant.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter a letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
