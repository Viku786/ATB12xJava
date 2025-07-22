package Ex_13_Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_115_Function_Arth {
    public static void main(String[] args) {

        //create a function sum,sub,multiply,div
        //with parameter [a,b] (takes from the user)

        //Logic building
        //Step 1 - Input a & B
        //a , b - int - Scanner
        //int - Variable result

        //step 2 - Rough Logic -> create function
        //function -> Type 4th -> with return and with argument

        //step 3 -> write the code and find and fix -> edge case

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }else{
            System.out.println("Enter the Integer only");
            System.exit(0);
        }

        System.out.println("Enter 2nd number : ");
        int b = 0;
        if(sc.hasNextInt()){
            b = sc.nextInt();
        }else{
            System.out.println("Enter the Integer only");
            System.exit(0);
        }

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
