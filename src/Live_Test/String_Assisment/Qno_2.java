package Live_Test.String_Assisment;

public class Qno_2 {
    public static void main(String[] args) {

        /*
        Input: String1: "Hello", String2: "hello", String3: "Hello"
        Output:
        equals(): false, equalsIgnoreCase(): true, compareTo(): -32
         */

        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        boolean eq = string1.equals(string2);

        boolean eqIgnore = string1.equalsIgnoreCase(string2);

        int result = string1.compareTo(string2);

        System.out.println("equals(): " + eq);
        System.out.println("equalsIgnoreCase(): " + eqIgnore);
        System.out.println("compareTo(): " + result);
    }
}
