package Task.Task_24th_May;

import java.util.Scanner;

public class Task06_24thMay_03 {
    public static void main(String[] args) {

        System.out.println("Enter number :  ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("-ve number factorial not possible");
        }
        int fact=1;
        for (int i = n; i >0 ; i--) {

            fact = fact * i;

        }
        System.out.println(fact);

        System.out.println("--------- Second Approach ------");

        int n1 = sc.nextInt();
        int fact1=1;
        if(n1<0){
            System.out.println("-ve number factorial not possible");
        }
        for (int i = 1; i <=n ; i++) {

            fact1 = fact1 * i;

        }
        System.out.println(fact1);
    }
}
