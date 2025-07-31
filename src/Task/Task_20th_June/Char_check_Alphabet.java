package Task.Task_20th_June;

import java.util.Scanner;

public class Char_check_Alphabet {
    public static void main(String[] args) {

        //11) Check if a Character is an Alphabet.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)){
            System.out.println(ch + " is an Alphabet");
        }else {
            System.out.println(ch + " is not an Alphabet");
        }

    }
}
