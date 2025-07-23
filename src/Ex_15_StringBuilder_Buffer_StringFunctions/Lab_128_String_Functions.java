package Ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab_128_String_Functions {
    public static void main(String[] args) {

        String name = "vikash";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));//StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat("Singh"));

        // 3. Contains()
        System.out.println(name.contains("om"));

        //4. Equals
        System.out.println(name.equals("vikash"));

        //5. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("VIKASH"));

        //6. IndexOf() -> vikash->? 0
        System.out.println(name.indexOf('a'));

        String s1 = "madam";
        //Returns the index with in this string of the
        // first occurance of the specified substring
        System.out.println(s1.indexOf("m"));

        //7. length()
        System.out.println(name.length());

        //8. replace()
        System.out.println(name.replace('a','u'));
    }
}
