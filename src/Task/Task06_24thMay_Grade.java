package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task06_24thMay_Grade {
    public static <scanner> void main(String[] args) {

        System.out.println("Enter the Grade : ");
        Scanner sc= new Scanner(System.in);
        String ch = sc.next();
        String ch1= ch.toUpperCase();

        switch (ch1){
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Very Good");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Needs Improvement");
            case "F" -> System.out.println("Fail");
            default -> System.out.println("Invalid Grade");
        }

    }
}
