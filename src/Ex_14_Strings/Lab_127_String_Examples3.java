package Ex_14_Strings;

public class Lab_127_String_Examples3 {
    public static void main(String[] args) {

        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Java".substring(1 ,3);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);//['J','a','v','a']

        String st = " Java ".trim();
        System.out.println(st);

        boolean b = " ".isBlank();
        System.out.println(b);

        String s11 = "ab".repeat(3);
        System.out.println(s11);

        boolean b1 = "Java".equalsIgnoreCase("JAVA");
        System.out.println(b1);

        String s12 = String.format("%s = %d", "age",25);
        System.out.println(s12);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
