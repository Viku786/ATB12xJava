package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_2 {
    public static void main(String[] args) {

        /* Implement a class "Student" with attributes "name", "rollNo", and "section".
        Add a method to print student details.
         */

        Student s = new Student("Vikash",55,"A");
        s.studentDetails();
    }
}

class Student{
    String name;
    int rollNo;
    String section;

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void studentDetails(){
        System.out.println("Name: " +name+ " , Roll_No: "+rollNo+ " , Section: "+section);
    }
}