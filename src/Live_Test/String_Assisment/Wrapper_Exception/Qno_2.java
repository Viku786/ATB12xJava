package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        try {
            int c = a/b;
            System.out.print("Result: "+c);
        } catch (Exception e) {
            System.out.print("Error: Cannot divide by zero"+e.getMessage());
        } finally {
            System.out.println(" Finally block executed");
        }
    }
}
