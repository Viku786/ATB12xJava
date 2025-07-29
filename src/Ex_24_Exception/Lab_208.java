package Ex_24_Exception;

public class Lab_208 {
    public static void main(String[] args) {
        System.out.println("Start the program");

        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException -> when no enter any value
            int a = Integer.parseInt(ip); //java.lang.NumberFormatException -> while input String
            int b = 100/a; //java.lang.ArithmeticException -> when divide by zero
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }


    }
}
