package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;
import java.util.*;

import static Live_Test.String_Assisment.Wrapper_Exception.GenericSwap1.swap;

public class Qno_3_b {
    public static void main(String[] args) {

        /*
        Write a generic method to swap two elements in an array.
        Input:
        [1, 2, 3], swap indices 0 and 2
        Output:
        [3, 2, 1]
        Input:
        ["A", "B", "C"], swap indices 0 and 1
        Output:
        ["B", "A", "C"]
         */

        Scanner sc = new Scanner(System.in);

        // Ask user for type of array
        System.out.print("Enter array type (int/string): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        if (type.equals("int")) {
            Integer[] arr = new Integer[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Get indices
            System.out.print("Enter two indices to swap: ");
            int i = sc.nextInt();
            int j = sc.nextInt();

            // Perform swap
            swap(arr, i, j);
            System.out.println("Swapped array: " + Arrays.toString(arr));

        } else if (type.equals("string")) {
            String[] arr = new String[n];
            System.out.println("Enter " + n + " strings:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }

            // Get indices
            System.out.print("Enter two indices to swap: ");
            int i = sc.nextInt();
            int j = sc.nextInt();

            // Perform swap
            swap(arr, i, j);
            System.out.println("Swapped array: " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid type entered!");
        }

        sc.close();

    }
}

class GenericSwap1 {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}