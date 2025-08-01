package Task.Task_25th_June;

public class Parameterized_Constructor {
    public static void main(String[] args) {

        /*
        Program 2: How do you create a parameterized constructor?
        A parameterized constructor takes arguments to initialize instance variables
         with custom values.
        Give one example, Write a code for that.
         */
        student s1 = new student(12,"Vikash");
        s1.display();

    }
}

class student{
    int roll;
    String name;

    public student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display(){
        System.out.println("Roll: " + roll + " & " + " Name: "+name);
    }
}