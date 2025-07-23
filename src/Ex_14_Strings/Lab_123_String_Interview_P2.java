package Ex_14_Strings;

public class Lab_123_String_Interview_P2 {
    public static void main(String[] args) {

        String s2 = "Hello";
        String s3 = "Hello";

        String s6 = new String("Hello");
        String s7 = new String("Hello");
        String s8 = new String("hello");

        // == -> Comparison -> String => This check reference location
        System.out.println(s2 == s6);// Result False because one available in Constant pool and other in object area
        System.out.println(s3 == s7);
        System.out.println(s6 == s7); //Result false because both are available in different location in object area
        System.out.println(s2 == s3);

        // Equals (Content) -> Value

        System.out.println(s2.equals(s6));
        System.out.println(s2.equals(s7));
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));

        //equalsIgnoreCase -> Vikash,VIKASH,VIKash ->vikash
        // == -> Check for the reference
        // = -> Assignment the value
    }
}
