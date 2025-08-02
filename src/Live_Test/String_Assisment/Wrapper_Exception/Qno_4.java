package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        try {
            System.out.println("Enter number to divide by: ");
            int divisor = sc.nextInt();

            int result = arr[0]/divisor;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException");
        }
    }
}
