package Ex_24_Exception;

public class Lab_209_Jr_QA {
    public static void main(String[] args) {

        String ip = null; // java.lang.ArrayIndexOutOfBoundsException -> when no enter any value
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int a = 0; //java.lang.NumberFormatException -> while input String
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            int b = 100/a; //java.lang.ArithmeticException -> when divide by zero
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
