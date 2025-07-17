package Ex_07_Increment_Decrement_Operator;

public class Lab_056_Post_De {
    public static void main(String[] args) {

        int a=10;
        System.out.println(++a);
        System.out.println(a);

        System.out.println("---------------");

        // Post Increment -> Print first and then Increase

        int a_post=10;
        int b= a_post++;
        System.out.println(a_post);
        System.out.println(b);

        int b1=11;
        System.out.println(b1++);
        System.out.println(b1);



    }
}
