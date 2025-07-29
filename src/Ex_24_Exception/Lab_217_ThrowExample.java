package Ex_24_Exception;

public class Lab_217_ThrowExample {
    public static void main(String[] args) {

       // validateAge_for_club(27);
        validateAge_for_club(16);

    }

    static void validateAge_for_club(int age) {
        if (age <18){
            try {
                throw new Exception("Age Can't be 18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                // we can use e.printStackTrace(); also for radder message
            }
        }
        else {
            System.out.println("Enjoy");
        }
    }
}
