package Ex_02_Java_Basics;

public class Lab014_constants {
    public static void main(String[] args) {
       /* int a;
        System.out.println(a);*/ // Error JVM not assigned the value

        int a=10;
        System.out.println(a);

       /* boolean b;
        System.out.println(b); */// local variable not initialized by JVM

        final int b = 15;
        //b=16; Java cannot assign value to final variable
        System.out.println(b);


    }
}
