package Ex_09_Switch;

import java.util.Scanner;

public class Lab070_Switch_Without_Break {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        switch (n){
            case 1 :
            {
                System.out.println("Monday");

            }
            case 2 :
            {
                System.out.println("Tuesday");

            }
            case 3 :
            {
                System.out.println("Wednesday");

            }
            case 4 :
            {
                System.out.println("Thrusday");

            }
            case 5 :
            {
                System.out.println("Friday");

            }
            case 6 :
            {
                System.out.println("Saturday");

            }
            case 7 :
            {
                System.out.println("Sunday");

            }
            default:
                System.out.println("Please enter valid day, Thanks");
        }
    }
}
