package Task.Task_16th_July;

public class Super_Keyword_Use {
    public static void main(String[] args) {

        cow cow = new cow();
        cow.show();
    }
}

class animal{
    String name ="Animal";

    animal(){
        System.out.println("Animal Constructor");
    }

    void sound(){
        System.out.println("Animals makes sound");
    }
}

class cow extends animal{
    String name = "Cow";

    cow(){
        super(); // call parent constructor
        System.out.println("Cow constructor");
    }

    void show(){
        System.out.println(super.name); // call parent variable
        super.sound(); //call parent method
    }
}