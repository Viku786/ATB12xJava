package Ex_19_OOPS_Part2.Poly.Method_Overloading;

public class Lab_165_Method_Overloading {
    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
       int r = m1.add(45,5,5);
        System.out.println(r);

        int r2 = m1.add(45,55);
        System.out.println(r2);

        double r3 = m1.add(44.45,55.55);
        System.out.println(r3);
    }
}
