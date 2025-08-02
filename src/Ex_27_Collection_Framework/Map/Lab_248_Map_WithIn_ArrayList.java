package Ex_27_Collection_Framework.Map;

import java.util.*;

public class Lab_248_Map_WithIn_ArrayList {
    public static void main(String[] args) {

        HashMap<String,String> student1 = new HashMap<>(); //To store in order
        student1.put("Name","Vicky");
        student1.put("Address","Zeromile");
        student1.put("home_Address","Patna");
        student1.put("Mobile","547548");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>(); //To store in order
        student2.put("Name","Vikash");
        student2.put("Address","Zeromile");
        student2.put("home_Address","Muzaffarpur");
        student2.put("Mobile","547548");
        System.out.println(student2);

        List student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        System.out.println(student);
    }
}
