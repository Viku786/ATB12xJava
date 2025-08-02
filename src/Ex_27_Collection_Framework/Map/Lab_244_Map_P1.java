package Ex_27_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_244_Map_P1 {
    public static void main(String[] args) {

        // Map m1 = new Map(); -> Unable to create because it is interface

        Map m1 = new HashMap(); //Output Order not maintain because of Hash Map
            //It is fastest
        /*
        Map is key - value pair
        If we not fix values of Key then it take any other data type
        because it is generic in nature
        Name: Vikash
        Roll: 1
        Phone ; 8709493279
         */

        //Put - it is used to put the key with the value into the map
        m1.put("Name","Vikash");
        m1.put(123,"Singh");
        m1.put(35.67,"abc");
        m1.put(true,"vikash");
        System.out.println(m1); //Order not maintain because of Hash Map

        Map m2 = new LinkedHashMap(); //It is used to maintain the Order
        m2.put("Name","Vikash");
        m2.put("Roll",1);
        m2.put("Mobile",8709493);
        System.out.println(m2);

        Map m3 = new TreeMap(); // It is used for maintain the sorted order
        //It sorted data in first letter of key
        m3.put("Name","Vikash");
        m3.put("Roll",1);
        m3.put("Mobile",8709493);
        System.out.println(m3);

    }
}
