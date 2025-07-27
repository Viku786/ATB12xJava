package Task.Task_1st_June;

import java.util.Scanner;

public class OddandEvenNumbersArray {
    public static void main(String[] args) {

        // 5. Odd and Even Numbers from an Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+ size +" elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int even_number=0;
        int odd_number=0;
        for (int i = 0; i < size; i++) {
            if(arr[i] % 2 ==0){
                even_number++;
            }else {
                odd_number++;
            }
        }

        System.out.println("Total Even number : "+even_number);
        System.out.println("Total Odd number : "+odd_number);
    }
}
