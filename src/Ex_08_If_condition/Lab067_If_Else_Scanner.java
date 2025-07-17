package Ex_08_If_condition;

import java.util.Scanner;

public class Lab067_If_Else_Scanner {
    public static void main(String[] args) {

        System.out.println("Enter your Age : ");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("You can not vote");
        }

    }
}
