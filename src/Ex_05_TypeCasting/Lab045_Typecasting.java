package Ex_05_TypeCasting;

public class Lab045_Typecasting {
    public static void main(String[] args) {

        long l=8709493279l;
        //short s=l; // Narrowing -> Implicit

        short s=(short)l; // Narrowing -> Explicit

        System.out.println(s); // 21023
    }
}
