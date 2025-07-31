package Task.Task_20th_June;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {

        /* 18 )  Electricity Bill Calculation (Based on Units Consumed)
        :- take the input from the user of Units.
        Implement Rate Structure:
        Define the rate structure for calculating the bill based on the
        number of units consumed.
         :-  First 100 units: 0.50Rs per unit
         :-  Next 100 units (101-200): 0.75Rs per unit
         :- Next 100 units (201-300): 1.20Rs per unit
         :- Above 300 units: 1.50Rs per unit
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Units : ");
        int unit = sc.nextInt();
        double Amount = 0;

        if(unit <=0){
            System.out.println("Enter Positive number greater than Zero");
        } else if (unit <=100) {
            Amount = Amount+unit*0.50;
        } else if (unit<=200) {
            Amount = 100*0.50 + (unit-100)*0.75;
        } else if (unit<=300) {
            Amount = 100*0.50 + 100*0.75 + (unit-200)*1.20;
        }else {
            Amount = 100*0.50 + 100*0.75 + 100*1.20 + (unit-300)*1.50;
        }
        System.out.println("Electricity bill: ₹" + Amount);
    }
}
