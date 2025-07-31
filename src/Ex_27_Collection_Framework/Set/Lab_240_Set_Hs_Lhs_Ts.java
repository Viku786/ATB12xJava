package Ex_27_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_240_Set_Hs_Lhs_Ts {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        //Hashing mechanism to store the element , no order
        // no duplicates

        hs.add("Mango");
        hs.add("Apple");
        hs.add("Guava");
        hs.add("Mango");
        //hs.add(123);
        hs.add(null);
        System.out.println(hs);

        System.out.println("----------------");

        Set lhs = new LinkedHashSet();
        //LinkedList mechanism to store the element
        // Order will maintain,no duplicates

        lhs.add("Mango");
        lhs.add("Apple");
        lhs.add("Guava");
        lhs.add("Mango");
        lhs.add(null);

        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("----------------");

        Set ts = new TreeSet<>();
        // Black and Red Tree mechanism to store the element
        //Order will maintain, Natural Sorting is done

        ts.add("Mango");
        ts.add("Apple");
        ts.add("Guava");
        ts.add("Mango");
        //ts.add(null); ->Not accepted
        System.out.println(ts);

    }
}
