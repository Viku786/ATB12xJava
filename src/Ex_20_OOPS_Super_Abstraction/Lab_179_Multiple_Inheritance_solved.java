package Ex_20_OOPS_Super_Abstraction;

public class Lab_179_Multiple_Inheritance_solved {
    public static void main(String[] args) {

        child1 child1 = new child1();
        child1.money(); // Its money from itself not from father and mother
    }
}

class child1 implements Father1,Mother1{

    @Override
    public void money() {
        System.out.println("Money from child");
    }

    @Override
    public void m1() {
        System.out.println("M1");

    }

    @Override
    public void f1() {
        System.out.println("F1");

    }

    @Override
    public void df() {
        Father1.super.df();
        Mother1.super.df();
    }


}
interface Father1{
    void money();
    void f1();

    default void df(){
        System.out.println("This is only allowed from Father");
    }
}

interface Mother1{
    void money();
    void m1();

    default void df(){
        System.out.println("This is only allowed from Mother");
    }
}
