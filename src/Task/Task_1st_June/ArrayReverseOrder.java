package Task.Task_1st_June;

import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {

        //1. Elements of an Array in Reverse Order.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+ size +" elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order : ");
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
