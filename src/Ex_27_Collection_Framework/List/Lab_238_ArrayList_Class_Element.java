package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_238_ArrayList_Class_Element {
    public static void main(String[] args) {

        Student s1 = new Student("Vikash","1");
        Student s2 = new Student("Vicky","2");
        Student s3 = new Student("Vinay","3");

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
