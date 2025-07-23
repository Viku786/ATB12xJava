package Ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab_130_SBuilder_SBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Vikash");
        stringBuffer.append("Singh");
        System.out.println(stringBuffer);

        String s = "Vikash";
        s = s+"Singh";
        System.out.println(s);
    }
}
