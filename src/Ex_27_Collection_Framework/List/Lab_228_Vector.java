package Ex_27_Collection_Framework.List;

import java.util.Vector;

public class Lab_228_Vector {
    public static void main(String[] args) {

        Vector v = new Vector(); //Array

        v.add(10);
        v.add("10");
        v.add("Vikash");
        v.add(2.56);

        System.out.println(v);

        v.remove("10");
        System.out.println(v);
        System.out.println(v.contains("10"));
    }
}
