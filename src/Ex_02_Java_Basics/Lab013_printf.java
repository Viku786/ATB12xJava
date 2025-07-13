package Ex_02_Java_Basics;

public class Lab013_printf {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);

        System.out.printf("Your variable is %d",a);
        System.out.println();

        int b=10;
        System.out.printf("a value is %d , b value is %d ",a,b);
        System.out.println();

        System.out.println("a = "+a +" , b = "+b);
    }
}
