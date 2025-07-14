package Ex_04_Operators;

public class Lab034_All_Operator {
    public static void main(String[] args) {

        boolean b1=true;
        int a=10;
        int b=20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("-------------------");

        //Compound Assignment Operator
        int age = 10;
       // age +=10;
        age /=10;
        System.out.println(age);
    }
}
