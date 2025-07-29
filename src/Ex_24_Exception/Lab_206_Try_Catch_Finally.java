package Ex_24_Exception;

public class Lab_206_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c= 10/a;
        } catch (Exception e) { // Throwable is parent of exception
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed");
        }
        System.out.println(a);
    }
}
