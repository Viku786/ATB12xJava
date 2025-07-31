package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_233_Interview {
    public static void main(String[] args) {

        /*
        Input - 1,2,3,4
        Output - 24,18,12,6
         */
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());

        for (Integer o : a1){
            System.out.println(6*o);
        }
    }
}
