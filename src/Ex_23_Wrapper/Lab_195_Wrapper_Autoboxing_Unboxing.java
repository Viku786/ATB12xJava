package Ex_23_Wrapper;

public class Lab_195_Wrapper_Autoboxing_Unboxing {
    public static void main(String[] args) {

        //Autoboxing -> Converting a primitive data type to an Integer (or they are known as wrapper classes)
        // is called auto-boxing. Whenever you convert a normal integer into a primitive,
        // and primitive ones into the classes, you will get extra functions.
        int a= 10;
        Integer b = a; // Boxing - int -> Integer - AutoBoxing - JVM will do it.
        System.out.println(a);
        System.out.println(b.intValue());


        // UnBoxing -> Whenever you convert a wrapper class into primitive ones,
        // you will lose the extra functionality.
        Integer aa = 43;
        int a1 = aa; // UNBOXING
        System.out.println(a1);
        System.out.println();

    }
}
