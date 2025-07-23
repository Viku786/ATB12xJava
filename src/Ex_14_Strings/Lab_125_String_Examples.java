package Ex_14_Strings;

public class Lab_125_String_Examples {
    public static void main(String[] args) {

        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        System.out.println(s.codePointAt(0));

        //CompareToIgnore(String str)
        int result = "abc".compareTo("ABC");
        int result2 = "abc".compareToIgnoreCase("ABC");
        System.out.println(result); // Output will be difference
        System.out.println(result2); //Output will be 0 or 1

        int idx = "Java".indexOf("a");
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s10 = String.join("-" , "Java" , "Python");
        System.out.println(s10);

        String s11 = "Java".replace('a' , 'o');
        System.out.println(s11);

        boolean b2 = "Java".startsWith("Ja");
        System.out.println(b2);
    }
}
