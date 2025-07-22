package Java_Project_Notepad;

import java.util.Scanner;
public class Notepad_FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many terms you want: ");
        int num = sc.nextInt();

        int a = 0, b=1;
        System.out.print("Fibonacci series are : "+a+ " "+b);

        for(int i=2; i<num; i++){
            int next = a + b;
            System.out.print(" "+next);
            a=b;
            b=next;
        }
    }
}
