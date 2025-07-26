package Ex_17_OOPS;

public class Lab_155_Cats {
    public static void main(String[] args) {

        cat c1 = new cat();
        cat c2 = null; // No object , it is reference
        new cat(); // There is two object

        c1.running();
       // c2.running(); // NullPointerException
    }
}
class cat{
    String name;

    void running(){
        System.out.println("Cat is running");
    }
}