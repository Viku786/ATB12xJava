package Ex_24_Exception;

public class Lab_210_Ec {
    public static void main(String[] args) {


        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException -> when no enter any value
            int a = Integer.parseInt(ip); //java.lang.NumberFormatException -> while input String
            int b = 100/a; //java.lang.ArithmeticException -> when divide by zero
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
