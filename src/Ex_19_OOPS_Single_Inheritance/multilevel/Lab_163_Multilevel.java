package Ex_19_OOPS_Single_Inheritance.multilevel;

public class Lab_163_Multilevel {
    public static void main(String[] args) {

        Son Vikash = new Son();
        Vikash.gf();
        Vikash.extra();
        Vikash.home();
        Vikash.BHK3();

        System.out.println("-----------------");

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        System.out.println("-----------------");

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        Son s1 = new Son();
        //Son s2 = new Father(); -> Error(Not possible)
        Father f1 = new Son(); //Dynamic Dispatch
        GrandFather gf1 = new Father();
        GrandFather gf2 = new Son();
        //Son s3 = new GrandFather();

    }
}
