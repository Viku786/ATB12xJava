package Ex_24_Exception;

public class Lab_205_Multiple_Problem {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            String s1 = null;
            s1.trim();
            c= 10/a;
        } catch (ArithmeticException e) { // Throwable is parent of exception
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
