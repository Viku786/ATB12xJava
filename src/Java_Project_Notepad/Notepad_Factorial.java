package Java_Project_Notepad;

import java.util.Scanner;
public class Notepad_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number which you want Factorial: ");
        int num = sc.nextInt();

        int factorial = 1;

        if(num == 0){
            System.out.println("Fatorial of " +num+ " is "+factorial);
        }

        for(int i=num;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println("Fatorial of " +num+ " is "+factorial);
    }
}
