package Task.Task_15th_June;

import java.util.ArrayList;

public class Wrapper_Collection {
    public static void main(String[] args) {
        /* 2. Using Wrapper in Collections
        Description: Shows why wrapper classes are needed in Java Collections
         (which do not support primitives).
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(70);

        for (Integer num : list){
            System.out.println("Values from list: "+num);
        }
    }
}
//  Note: Collections like ArrayList only work with objects (not primitives like int).
//  That's why Integer (wrapper) is used.