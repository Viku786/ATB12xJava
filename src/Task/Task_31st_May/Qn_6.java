package Task.Task_31st_May;

import java.util.Scanner;

public class Qn_6 {
    public static void main(String[] args) {

        //First Letter of Each Word in a String

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

            System.out.println("First letter of each word in a sentence : " );
            for (String word : words){
                if (!word.isEmpty()){
                    System.out.print(word.charAt(0) + " ");
                }
            }
        }
    }
}
