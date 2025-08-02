package Ex_27_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_245_Map_P2 {
    public static void main(String[] args) {

        Map map = new HashMap(); //We use (due to dynamic dispatch means Parent class)
       // HashMap map = new HashMap<>();-> Not use
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three"); //Not taken
        map.put(3, null); //Taken due to current value
        map.put(null, null);
        map.put(null , "Four");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("seven"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get(1));

    }
}
