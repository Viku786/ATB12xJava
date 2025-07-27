package Ex_19_OOPS_Part2.Poly.Method_OverRiding;

public class Lab_166 {
    public static void main(String[] args) {

        Vikash v1 = new Vikash();
        v1.home();
        v1.p1();

        System.out.println("-----------------");

        Father f1 = new Father();
        f1.home();
        f1.f1();

        System.out.println("-------------------");

        Father f2 = new Vikash();
        f2.home();
    }
}
