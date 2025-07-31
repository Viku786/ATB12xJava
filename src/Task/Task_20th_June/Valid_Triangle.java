package Task.Task_20th_June;

import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {

        // 14) Check if a Triangle is Valid Based on Three Sides.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st side of triangle: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd side of triangle: ");
        int b = sc.nextInt();

        System.out.println("Enter 3rd side of triangle: ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
