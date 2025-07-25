package Ex_16_Arrays;

import java.util.Scanner;

public class Lab_140_Arrays_user_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array(int) : ");
        int size = sc.nextInt();

        String[] num_marks = new String[size];
        //float[] num_marks = new float[size];
        //int[] num_marks = new int[size];

        for (int i = 0; i<num_marks.length;i++){
            System.out.println("Enter the elements --> "+i);
            num_marks[i] = sc.next();
        }

        System.out.println("print the Values -------");

        for(String mark : num_marks){
            System.out.println(mark);
        }
        sc.close();
    }
}
