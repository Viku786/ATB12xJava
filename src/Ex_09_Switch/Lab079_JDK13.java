package Ex_09_Switch;

public class Lab079_JDK13 {
    public static void main(String[] args) {

        int itemcode = 003;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are Electronics Gadget");
                break;

            case 004,006,007:
                System.out.println("All of them are Mechanical");
                break;

            default:
                System.out.println("None");

        }
    }
}
