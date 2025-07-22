package Ex_13_Functions;

import java.util.Scanner;

public class Lab_116_Function_Arth2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = getValidInt(sc, "Enter 1st number: ");
        int b = getValidInt(sc, "Enter 2nd number: ");

        int result_Sum = sum(a,b);
        int result_subtract = subtract(a,b);
        int result_Multiply = multiply(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_Sum);
        System.out.println(result_subtract);
        System.out.println(result_Multiply);
        System.out.println(result_div);
        System.out.println(result_mod);

    }

     static int getValidInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        if (sc.hasNextInt()) return sc.nextInt();
        else {
            System.out.println("Enter an Integer only");
            System.exit(0);
            return -1; // unreachable, but required for compilation
        }
    }

    static int sum(int a , int b){
        return a+b;
    }

    static int subtract(int a , int b){
        return a-b;
    }

    static int multiply(int a , int b){
        return a*b;
    }

    static int div(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new  ArithmeticException ("Division by zero not allowed");
        }
        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }
}
