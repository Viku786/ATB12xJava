package Task.Task_19th_June;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        //9) Check if a Year is a Leap Year.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int n = sc.nextInt();

        if((n % 4 ==0 && n % 100 != 0 )|| n % 400 ==0){
            System.out.println("The entered year " + n + " is Leap year");
        }else {
            System.out.println("The entered year " + n + " is not a Leap year");
        }
    }
}
