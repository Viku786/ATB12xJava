package Task.Task_20th_June;

import java.util.Scanner;

public class Bonus_Calculation {
    public static void main(String[] args) {
        
        /* 19)  Calculate Bonus Based on Salary and Years of Experience.
        :- take the salary and Year info from the User.
        Implement Bonus Calculation Logic:
        Define the bonus structure based on salary and years of experience. 
         :- If years of experience is less than 1 year: No bonus.
         :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
         :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
         :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the total year : ");
        double year = sc.nextDouble();

        double bonus = 0;
        
        if(year<=0 || salary<=0){
            System.out.println("Please enter positive number greater than zero");
        } else if (year < 1) {
            System.out.println("No Bonus");
        } else if (year >=1 && year<=3) {
             bonus = salary * 0.05;
        } else if (year<=6) {
             bonus = salary * 0.10;
        }else {
             bonus = salary * 0.15;
        }

        System.out.println("Bonus: ₹" + bonus);
    }
}
