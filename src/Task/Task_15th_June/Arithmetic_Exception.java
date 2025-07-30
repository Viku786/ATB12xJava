package Task.Task_15th_June;

public class Arithmetic_Exception {
    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: "+e.getMessage());
        }
    }
}
