package Ex_26_Generic;

public class Lab_220_Generics {
    public static void main(String[] args) {

        temp_sum(23,45);
        temp_sum("Vikash","Singh");
        temp_sum(3.5,5.6);

    }

    static Integer temp_sum(Integer a, Integer b){
        return a + b;
    }

    static String temp_sum(String a, String b){
        return a + b;
    }

    // In place of T we take any character
    static <T> T temp_sum(T a, T b) {
        return null;
    }
}
