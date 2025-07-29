package Ex_24_Exception;

import java.util.Scanner;

public class Lab_207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int v = sc.nextInt();
            int a = 10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing Scanner");
            sc.close();
        }
    }
}
