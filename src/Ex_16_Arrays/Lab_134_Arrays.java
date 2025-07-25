package Ex_16_Arrays;

import java.util.Arrays;

public class Lab_134_Arrays {
    public static void main(String[] args) {

        int a =10;
        int [] marks = {89,67,87,91,45,78};
        boolean[] is_Married_People = {true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
       // System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException
        //System.out.println(marks[10]);//ArrayIndexOutOfBoundsException

        char c ='A';
        String name = "Vikash";
        String name_each_element_char= Arrays.toString(name.split(""));
        //["V","i","k","a","s","h"]
    }
}
