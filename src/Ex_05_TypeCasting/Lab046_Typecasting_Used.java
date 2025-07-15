package Ex_05_TypeCasting;

import java.sql.SQLOutput;

public class Lab046_Typecasting_Used {
    public static void main(String[] args) {

        int course = 100;
        float GST=18.45f;
        //int total1 = course + GST; // Narrowing -> Implicit

        int total= course + (int)GST; // Narrowing -> Explicit
        System.out.println(total);

        float total1 = course + GST; //Widening -> Auto -> Implcit
        System.out.println(total1);

        float total3 = (float)course + GST; // Widening -> explicit
        System.out.println(total3);
    }
}
