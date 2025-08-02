package Ex_27_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_249_HashTable {
    public static void main(String[] args) {

        /*
        Map -> key,Value & null allows
        HashTable - Synchronised, Slow and Legacy class - Thread Safe
        T1, T2 -> they will use one by one
         */

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
       // ht1.put(4,null); //java.lang.NullPointerException
        //ht1.put(null,"one"); -> java.lang.NullPointerException

        System.out.println(ht1);


        HashMap<Integer,String> ht2 = new HashMap<>();
        ht2.put(1,"one");
        ht2.put(2,"two");
        ht2.put(3,"three");
        ht2.put(4,null);
        ht2.put(null,"one");

        System.out.println(ht2);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
