package Ex_24_Exception;

public class Lab_218_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println(a);
            //System.exit(0);
            //Can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Hello Last");
        }
    }
}
