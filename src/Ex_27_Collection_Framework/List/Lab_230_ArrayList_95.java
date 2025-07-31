package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_230_ArrayList_95 {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Bread");
        list.add("Milk");
        list.add("Butter");
        list.add("Paneer");
        list.add("Jam");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        System.out.println("--------------");

        for (Object o : list){
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
