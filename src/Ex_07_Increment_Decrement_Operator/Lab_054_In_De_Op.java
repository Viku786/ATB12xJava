package Ex_07_Increment_Decrement_Operator;

public class Lab_054_In_De_Op {
    public static void main(String[] args) {

        String s = args[0];
        String s1 = args[1];
        String s2 = args[2];
        String s3 = args[3];

        int age = Integer.parseInt(s);
        System.out.println("Age -> " +age);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //  If the arguments are less -> java.lang.ArrayIndexOutOfBoundsException
    }
}
