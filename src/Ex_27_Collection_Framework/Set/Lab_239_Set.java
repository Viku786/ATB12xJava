package Ex_27_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_239_Set {
    public static void main(String[] args) {

        Set hs = new HashSet<>();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet<>();

        hs.add("Vikash");
        hs.add("vikash");
        hs.add("Vikash"); //No duplicate value stored
        hs.add("Singh");
        System.out.println(hs); // Output - 3
    }
}
