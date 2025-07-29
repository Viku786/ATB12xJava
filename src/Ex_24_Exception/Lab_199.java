package Ex_24_Exception;

public class Lab_199 {
    public static void main(String[] args) {

        int a =0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        //Unchecked -> ArithmeticException

        String name = null;
        name.trim(); // java.lang.NullPointerException: Cannot invoke "String.trim()"
    }
}
