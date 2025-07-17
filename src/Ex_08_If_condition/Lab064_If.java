package Ex_08_If_condition;

public class Lab064_If {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("You can not vote");
        }
    }
}
