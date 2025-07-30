package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_225_List {
    public static void main(String[] args) {

        List fruits = List.of("Apple","Orange","Mango","Guava","Watermelon");
        System.out.println(fruits);

        List arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Vikash");
        arrayList.add(null);
        arrayList.add("Vikash"); // Duplicate Allowed
        arrayList.add(123); // Different Data Type allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
