package Ex_19_OOPS_Single_Inheritance;

public class Lab_161_SI {
    public static void main(String[] args) {

        Son vikash = new Son();
        System.out.println(vikash.gold_f);
        vikash.bhk2();
        vikash.bhk3();

        cousin c = new cousin();
        c.bhk3();
        //System.out.println(c.gold_f);
    }
}
