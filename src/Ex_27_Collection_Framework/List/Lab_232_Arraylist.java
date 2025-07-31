package Ex_27_Collection_Framework.List;

import java.util.*;

public class Lab_232_Arraylist {
    public static void main(String[] args) {

        List marks = new ArrayList<>();
        marks.add(90);
        marks.add(75);
        marks.add(87);
        marks.add(99);
        marks.add(65);

        System.out.println(marks);
//        Collections.sort(marks);
//        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);


    }
}
