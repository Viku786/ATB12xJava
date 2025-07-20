package Ex_11_While;

import java.util.Scanner;

public class Lab_104_While_Factorial {
    public static void main(String[] args) {

        System.out.println("Welcome to factorial Program");
        System.out.println("Enter the number , whose factorial you want! ");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()){
            System.out.println("Please enter Integer number");
        }

        int n=sc.nextInt();
        int factorial = 1;
        if (n ==0){
            System.out.println("Factorial of Zero is : "+factorial);
        }

        if (n >Integer.MAX_VALUE){
            System.out.println("Can't get the factorial as out of bound (Int)");
        }

        int i=1;
        while (i<=n){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of number is "+factorial);
    }
}
