package Task.Task_23th_June;

import java.util.Scanner;

public class Days_into_Years_Months_Days {
    public static void main(String[] args) {

        /* 23) Convert Days into Years, Months, and Days.
         :- Take the Days Input from the User
         Define the conversion logic:
        :- Assume 1 year = 365 days.
        :- Assume 1 month = 30 days
        :- Convert the Days into Years, Month and days and Print it.
        if you input 1000 days, the output of the program would be:
         2 years, 9 months, and 0 days.
         */

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Days: ");
        int days = sc.nextInt();

        int year = days / 365;
        int remaining_month = days % 365;
        int months = remaining_month / 30;
        int remaining_days = remaining_month % 30;

        System.out.println(days + " days = " + year + " years, " + months + " months, and " + remaining_days + " days.");
    }
}
