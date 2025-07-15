package Ex_06_Ternary_Operator;

public class Lab052_TO_Three_Max {
    public static void main(String[] args) {

        int a = 10 , b = 30 , c = 20;
        int s = (a > b) ? (a > c ? a : c) : (b > c ? b : c) ;
        System.out.println( "Max number is = " +s);
    }
}
