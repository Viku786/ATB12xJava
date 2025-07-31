package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_236_AL_Iteration {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vikash");
        list.add("Vicky");
        list.add("Vinay");

        System.out.println("To Print ArrayList - 1");

        for (String str:list){
            System.out.println(str);
        }

        System.out.println("To Print ArrayList - 2");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("To Print ArrayList - 3");

        for (int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
