package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        Integer[] numbers = new Integer[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // autoboxing from int to Integer
        }

        Integer max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max: " + max);
    }
}
