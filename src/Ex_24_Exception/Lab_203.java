package Ex_24_Exception;

public class Lab_203 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        try {
            d = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
       catch(Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
