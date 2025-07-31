package Task.Task_20th_June;

import java.util.Scanner;

public class Employee_Net_Salary {
    public static void main(String[] args) {

        /*20)  Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
        Research from your side for this program.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Basic Pay: ");
        double basic_pay = sc.nextDouble();

        double hra = 0.2 * basic_pay;
        double da = 0.1 * basic_pay;
        double tax = 0.1 * basic_pay;
        double netSalary = basic_pay + hra + da - tax;

        System.out.println("Net Salary: ₹" + netSalary);
    }
}
