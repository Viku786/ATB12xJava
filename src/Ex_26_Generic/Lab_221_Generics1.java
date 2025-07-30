package Ex_26_Generic;

public class Lab_221_Generics1 {
    public static void main(String[] args) {

        temp(34 , 43);
        temp(3.4,4.5);
        temp("Vikash","Singh");
    }

    static <T> T temp(T a,T b){
        System.out.println(a + " " + b);
        return null;
    }
}
