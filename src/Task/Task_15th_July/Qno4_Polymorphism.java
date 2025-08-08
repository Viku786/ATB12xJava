package Task.Task_15th_July;

public class Qno4_Polymorphism {
    public static void main(String[] args) {

        multipleSum ms = new multipleSum();
        System.out.println(ms.add(45,55));
        System.out.println(ms.add(45,55,90));

        Animal a = new cat();
        a.sound();
    }
}

class multipleSum{
    int add(int a, int b){
        return  a+b;
    }

    int add (int a, int b, int c){
        return a + b + c;
    }
}

class Animal{
    void sound(){
        System.out.println("Animals makes sound");
    }
}

class cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meow");
    }
}