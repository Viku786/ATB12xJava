package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer boxed = num;
        int unboxed = boxed;

        System.out.println("Autoboxed: " + boxed + ", Unboxed: " + unboxed);
    }
}
