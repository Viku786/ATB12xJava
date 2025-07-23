package Ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab_133_SBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);
        stringBuffer.delete(5,16); //Deleting the substring
        System.out.println(stringBuffer);
        stringBuffer.replace(0 , 4, "C++");
        System.out.println(stringBuffer);

    }
}
