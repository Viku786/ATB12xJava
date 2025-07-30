package Task.Task_15th_June;

public class Multiple_Catch_Block {
    public static void main(String[] args) {
        /* 5. Multiple Catch Blocks Example
        Description: Shows handling different exceptions
        (ArrayIndexOutOfBoundsException and ArithmeticException) in one program.
         */
        try {
            int[] arr = {10,20,30};
            int result = arr[5]/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException catch: "+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception catch: "+e.getMessage());
        }

    }
}
