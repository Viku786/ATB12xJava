package Task.Task_15th_June;

public class Autobox_and_Unbox {
    public static void main(String[] args) {
        /* 1. Autoboxing and Unboxing
        Description: Demonstrates automatic conversion between primitives and
        their wrapper classes.
         */

        int num = 100; // Primitive
        Integer num1 = num; //Autoboxing
        System.out.println("Autoboxed Integer: "+num1);

        Integer num2 =200;
        int num3 = num2;//Unboxed
        System.out.println("Unboxed Integer: "+num3);
    }
}
