package Task.Task_11th_July;

public class Program_7 {
    public static void main(String[] args) {

        /* Program 7: Demonstrate public Access Modifier
        :- Understand how public methods are accessible from anywhere.
        📝 Instructions:
        Create a class Student with a public method showInfo()
        that prints "Public Access: Student Info".
        In the main() method, create an object of Student.
        Call showInfo() directly from anywhere like same class, sub class,
        different class same package, in different package
        it should work without restriction.

         */

        Student1 s = new Student1();   // Accessible in same package
        s.showInfo();
    }
}

