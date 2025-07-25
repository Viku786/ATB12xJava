package Task_31st_May;

import java.util.Scanner;

public class Qn_4 {
    public static void main(String[] args) {

        //Count the Number of Words in a String (replaceAll)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String text = sc.nextLine();

        // Remove extra spaces, tabs, and newlines
        text = text.replaceAll("\\s+", " ").trim();

        if (text.isEmpty()){
            System.out.println("No Sentence write, Please add some sentence");
        }
        else {
            // Split by space to count words
            String[] words = text.split(" ");
            System.out.println("Number of words: " + words.length);
        }
    }
}
