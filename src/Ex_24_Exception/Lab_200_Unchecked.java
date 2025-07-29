package Ex_24_Exception;

public class Lab_200_Unchecked {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("Going to be executed when there is problem in line 7");
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
