package Ex_24_Exception;

public class Lab_204 {
    public static void main(String[] args) {

        int a = 0;
        int c = 0;
        try {
            c= 10/a;
        } catch (Throwable e) { // Throwable is parent of exception
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
