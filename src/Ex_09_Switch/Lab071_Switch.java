package Ex_09_Switch;

import java.util.Scanner;

public class Lab071_Switch {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        switch (n) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
        }
    }
}
