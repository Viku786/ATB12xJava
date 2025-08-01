package Task.Task_25th_June;

public class Default_Constructor {
    public static void main(String[] args) {

        /*
        Program 1 : What is a default constructor? Give one example,
         Write a code for that.
         */
        /*
        A default constructor is a constructor with no parameters.
        It is used to initialize default values.
         */

        Student s = new Student();
        s.display();
    }
}

class Student{

    String name;
    public Student() {
        name = "Vikash";
    }
    public void display(){
        System.out.println("Name: "+name);
    }
}
