package Task.Task_16th_July;

public class Method_Overriding {
    public static void main(String[] args) {

        Add ad = new sum();
        ad.addition();
    }
}

class Add{
    void addition(){
        System.out.println("Parent class sum");
    }
}

class sum extends Add{
    @Override
    void addition() {
        System.out.println("Child class sum");
    }
}