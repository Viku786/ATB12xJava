package Ex_05_TypeCasting;

public class Lab043_Typecasting_1 {
    public static void main(String[] args) {

        byte b =10;
        int a = b; // Valid syntax -> Widening -> Implicit Casting -> Automatically donne
        int a1= (int)b; // Widening Explicit Casting (int) - Optional

        System.out.println(a);
        System.out.println(a1);
    }
}
