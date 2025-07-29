package Ex_24_Exception;

public class Lab_202 {
    public static void main(String[] args) {

        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
