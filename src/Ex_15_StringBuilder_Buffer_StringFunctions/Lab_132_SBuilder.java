package Ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab_132_SBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Vikash");
        stringBuilder.append(132);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
