package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_231_Nested_ArrayList {
    public static void main(String[] args) {

        List <String> fruits1 = new ArrayList<>();
        fruits1.add("Mango");
        fruits1.add("Apple");
        fruits1.add("Guava");
        fruits1.add("Litchi");

        System.out.println(fruits1);

        List <String> fruits2 = new ArrayList<>();
        fruits2.add("Papaya");
        fruits2.add("Cherry");
        fruits2.add("Watermelon");

        System.out.println(fruits2);

        List <String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Cauliflower");

        System.out.println(vegetables);

        List all_fruits_Vege = new ArrayList<>();
        all_fruits_Vege.add(fruits1);
        all_fruits_Vege.add(fruits2);
        all_fruits_Vege.add(vegetables);

        System.out.println(all_fruits_Vege);
        System.out.println(all_fruits_Vege.size());
        System.out.println(all_fruits_Vege.get(1));
    }
}
