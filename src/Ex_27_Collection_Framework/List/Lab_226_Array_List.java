package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_226_Array_List {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("1");//0
        list.add("2");//1
        list.add("3");//2
        list.add("3");//3
        list.add(4);//4
        list.add(true);//5

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));//Find the first occurance of element of list
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------");

        for (Object o :list){
            System.out.println(o);
        }

        System.out.println("-----------------");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
