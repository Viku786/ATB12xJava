package Ex_14_Strings;

public class Lab_122_Interview_P1 {
    public static void main(String[] args) {

        String s = "Hello"; /* There are still one string in String Constant Pool but
                                    references will be two*/
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = "hello";//Now , There are two string in String Constant Pool


        String s6 = new String("Hello");/* There are two string in Object Area*/
        String s7 = new String("Hello");
        String s8 = new String("Hello"); // Now three string in Object Area

    }
}
