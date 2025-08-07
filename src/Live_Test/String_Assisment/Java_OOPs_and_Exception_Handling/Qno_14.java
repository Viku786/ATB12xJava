package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_14 {
    public static void main(String[] args) {

        /* Implement exception handling for a program that divides two numbers
        and catches ArithmeticException, NumberFormatException,
        and ArrayIndexOutOfBoundsException.
         */

        try {
//            int result = 10/0;
//            System.out.println("Result: "+result);

//            int number = Integer.parseInt("erweuyd");
//            System.out.println("Result: "+number);

            int [] numbers = {1,2,3};
            System.out.println("Result: "+numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }
    }
}
