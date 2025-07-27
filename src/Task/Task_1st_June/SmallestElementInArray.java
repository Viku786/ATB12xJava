package Task.Task_1st_June;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {

        // 3. Print the smallest Element in an Array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+ size +" elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        for (int i = 1; i < size ; i++) {
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println("smallest Element in an Array is -> "+smallest);
    }
}
