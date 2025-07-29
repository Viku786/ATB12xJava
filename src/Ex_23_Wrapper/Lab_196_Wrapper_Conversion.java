package Ex_23_Wrapper;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Lab_196_Wrapper_Conversion {
    public static void main(String[] args) {

        String num = "10";
        int a = 10;

        //String -> Wrapper conversion
        Integer aa = Integer.parseInt(num);
        // parsex()  -> Double.parseDouble() , Float.parseFloat()

        //String to Primitive
        int a_p = Integer.parseInt(num); // (String to Wrapper class then Wrapper class to primitive(Unboxing

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

        Integer aa4 = 10;
        String s = aa4.toString();
        System.out.println(s);
        System.out.println(s instanceof String);

        //Integer a11 = new Integer(10); -> Now we not use it
        Integer a11 = 10; // It is equal to new Integer(10);

        ArrayList <Integer> number = new ArrayList<>();
        number.add(100);

        Integer myInt = 10;
        String stringValue = myInt.toString();
        int p_int = myInt.intValue();
        int p_int2 = myInt;
    }
}
