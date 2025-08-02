package Ex_27_Collection_Framework.Map;

import java.util.*;

public class Lab_246_Map_Real {
    public static void main(String[] args) {

        Map<String,Object> student = new HashMap<>();
        student.put("Name","Vikash");
        student.put("Address","Zeromile");
        student.put("home_Address","Muzaffarpur");
        student.put("Mobile","874940");
        System.out.println(student);

        Map<String,Object> student1 = new LinkedHashMap<>(); //To store in order
        student1.put("Name","Vicky");
        student1.put("Address","Zeromile");
        student1.put("home_Address","Patna");
        student1.put("Mobile","547548");
        System.out.println(student1);

        Set book = new HashSet(); //Set has only values
        book.add("Reach Dad Poor Dad");
        book.add("Sapians");
        book.add("Atomic Habit");
        book.add("Be a Millionaire");
        System.out.println(book);
    }
}
