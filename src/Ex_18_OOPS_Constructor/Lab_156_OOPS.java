package Ex_18_OOPS_Constructor;

public class Lab_156_OOPS {
    public static void main(String[] args) {
        Baby b = new Baby();
        new Baby();
        new Baby();
        Baby b2; // It is reference
    }
}
class Baby{
    String name;

     Baby() {
         //This is called automatically when object is created
         System.out.println("I am called , Object is created");
    }
}