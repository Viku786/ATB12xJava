package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_229_List {
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
    }
}
