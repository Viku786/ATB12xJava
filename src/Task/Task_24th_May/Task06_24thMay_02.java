package Task.Task_24th_May;

import java.util.Scanner;

public class Task06_24thMay_02 {
    public static void main(String[] args) {

        System.out.println("Enter a month number between (1-12) :  ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a year : ");
        int n1 = sc.nextInt();

        switch(n){

            case 1 :
                System.out.println("January = 31 Days");
                break;

            case 2:
                if ((n1 % 4 ==0 && n1 % 100 != 0 )|| n1 % 400 ==0){
                    System.out.println("February = 29 Days");
                    break;
                }else {
                    System.out.println("February = 28 Days");
                    break;
                }

            case 3:
                System.out.println("March = 31 Days");
                break;

            case 4:
                System.out.println("April = 30 Days");
                break;

            case 5:
                System.out.println("May = 31 Days");
                break;

            case 6:
                System.out.println("June = 30 Days");
                break;

            case 7:
                System.out.println("July = 31 Days");
                break;

            case 8:
                System.out.println("August = 31 Days");
                break;

            case 9:
                System.out.println("September = 30 Days");
                break;

            case 10:
                System.out.println("October = 31 Days");
                break;

            case 11:
                System.out.println("November = 30 Days");
                break;

            case 12:
                System.out.println("December = 31 Days");
                break;

            default:
                System.out.println("Invalid Number, Please enter Month number between 1 to 12 ");
        }
    }
}
