package Task.Task_1st_June;

import java.util.Scanner;

public class SumofAll_ItemsoftheArray {
    public static void main(String[] args) {

        // 4. Sum of All Items of the Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+ size +" elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the Array is : "+sum);
    }
}
