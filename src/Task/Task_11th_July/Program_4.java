package Task.Task_11th_July;

public class Program_4 {
    public static void main(String[] args) {

        /*
        Program 4: Create a Program to Access the private access modifier
         */

        student s = new student();
        System.out.println("Access Private access modifier: " + s.getName());
    }
}

class student {
    private String name = "Vikash";

    public String getName() {
        return name;
    }
}