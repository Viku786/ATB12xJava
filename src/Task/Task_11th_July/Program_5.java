package Task.Task_11th_July;

public class Program_5 {
    public static void main(String[] args) {

        /*
        Program 5: default (no modifier) access - same package only
        📝 Instructions:
            Create a class Student with a method showDetails() without
            any access modifier (default).
            In the same file or same package, create a class TestDefault.
            In main(), create an object of Student and call the showDetails() method.
         */

        Parent1 p1 = new Parent1();
        p1.display();

        Child2 c2 = new Child2();
        c2.show();

        Student s = new Student();
        s.showDetails();

    }
}

class Student {
    void showDetails() {
        System.out.println("Student details (default access)");
    }
}