package Task.Task_19th_June;

import java.util.Scanner;

public class Eligible_For_Vote {
    public static void main(String[] args) {

        //5) Check if a Person is Eligible to Vote (Age Check).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are of " + age + " years eligible for vote");
        }else{
            System.out.println("You are of " + age + " years not eligible for vote");
        }
    }
}
