package Ex_09_Switch;

public class Lab078_JDK13_Above {
    public static void main(String[] args) {

        //In JDK > 13

        int a = 004;
        switch (a){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
