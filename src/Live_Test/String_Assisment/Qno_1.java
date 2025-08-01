package Live_Test.String_Assisment;

import java.util.Scanner;

public class Qno_1 {
    public static void main(String[] args) {

        /*
        Input: Hello World
        Output:
         Length: 11, First char: H, Substring: World
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        int length = str.length();
        char firstchar = str.charAt(0);


        // // Split string into words and get the last word
        String[] words = str.trim().split("\\s+");
        String lastWord = words[words.length - 1];


        System.out.println("Length: "+length);
        System.out.println("First char:"+firstchar);
        System.out.println("Substring:"+lastWord);
    }
}
