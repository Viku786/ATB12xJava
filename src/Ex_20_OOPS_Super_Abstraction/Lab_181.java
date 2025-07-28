package Ex_20_OOPS_Super_Abstraction;

public class Lab_181 {
    public static void main(String[] args) {

        Vikash v = new singh();//Dynamic Dispatch will Interface
        singh s1 = new singh(); //Dynamic Dispatch will Interface
        s1.display();
        System.out.println(s1.a);

    }
}

class singh implements Vikash{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Vikash{
    int a =10;
    void display();
}