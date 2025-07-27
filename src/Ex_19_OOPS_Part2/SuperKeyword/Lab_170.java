package Ex_19_OOPS_Part2.SuperKeyword;

public class Lab_170 {
    public static void main(String[] args) {

    }
}

class Father{
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class son extends Father{
    son(){
        super();
    }

    void bike (){}

    void newHouse(){
        super.home();
        System.out.println(super.gold);

        this.bike();
    }
}