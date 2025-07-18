package Task;

import java.util.Scanner;

public class Task06_24thMay_02_Second_Approach {
    public static void main(String[] args) {

        System.out.println("Enter a month number between (1-12) :  ");
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        int days=0;

        switch(month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;

            case 2 :
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days=29;
                    break;
                } else {
                    days=28;
                    break;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;

            default:
                System.out.println("Invalid Number, Please enter Month number between 1 to 12 ");

        }

        System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
        }

}
