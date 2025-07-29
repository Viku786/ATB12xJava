package Ex_24_Exception;

public class Lab_198_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException -> when no enter any value
        int a = Integer.parseInt(ip); //java.lang.NumberFormatException -> while input String
        int b = 100/a; //java.lang.ArithmeticException -> when divide by zero
        System.out.println(b);

        System.out.println("End of the program");
    }
}
