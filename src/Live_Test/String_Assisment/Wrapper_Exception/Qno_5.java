package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);// Autoboxing
        int num = sc.nextInt();
        Integer obj = num;
        System.out.println("Autoboxed: " + obj);


        Integer obj2 = 20;
        int num2 = obj2;
        System.out.println("Unboxed: " + num2);
    }
}
