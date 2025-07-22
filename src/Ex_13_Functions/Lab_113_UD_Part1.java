package Ex_13_Functions;

import java.util.Scanner;

public class Lab_113_UD_Part1 {
    public static void main(String[] args) {

       // User Defined Functions :
        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        //Without Argument/Parameters and without return type
        wp_wr();

        //Without Argument/Parameters but with return type
        String s1 = wp_but_retrnType();
        System.out.println(s1);

        // 3.With Parameters and Without Return Type
        withparameter_but_noreturntype("Vikash",26,45000l);
        withparameter_but_noreturntype("Vijay",26,45000l);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String s = sc.next();
        System.out.println("Enter Age : ");
        int a1 = sc.nextInt();
        System.out.println("Enter Salary : ");
        double d1 = sc.nextDouble();
        withparameter_but_noreturntype(s, a1 ,d1);

        // 4. With Parameters and With Return Type

        int s3 = Sum_of_two_number(4,5);
        System.out.println(s3);
        int s2 = Sum_of_three_number(65,76,87);
        System.out.println(s2);

    }

    // 1.Without Parameters and Without Return Type
    static void wp_wr(){
        System.out.println("Hi , How are you!");
    }

    // 2.Without Parameters but With Return Type
    static String wp_but_retrnType(){
        System.out.println("Hi");
        return "How are you!";
    }

    // 3.With Parameters and Without Return Type
    static void withparameter_but_noreturntype(String name , int age , double salary){
        System.out.println("Your Name is : "+name+ "\nYour Age is : "+age+ "\nYour Salary is : "+salary);

    }

    // 4. With Parameters and With Return Type
    static int Sum_of_two_number(int a, int b){
        return a+b;
    }
    static int Sum_of_three_number(int a , int b,int c){
        return a+b+c;
    }

}
