package Ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab_129_StringBuilder_vs_Buffer {
    public static void main(String[] args) {

        //String =90%
        String s = "Vikash";
        String s1 = new String("Vikash");

        //les than 10%
        StringBuffer stringBuffer = new StringBuffer("Vikash");
        StringBuilder stringBuilder = new StringBuilder("Vikash");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
    }
}
