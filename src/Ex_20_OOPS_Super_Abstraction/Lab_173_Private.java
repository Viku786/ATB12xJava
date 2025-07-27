package Ex_20_OOPS_Super_Abstraction;

public class Lab_173_Private {
}

class xyz{
    xyz(){

    }
    protected int my_gold = 10;
}

class cab extends xyz{
    void display(){
        System.out.println(super.my_gold);
    }
}
