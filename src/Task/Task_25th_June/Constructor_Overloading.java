package Task.Task_25th_June;

public class Constructor_Overloading {
    public static void main(String[] args) {

        /*
        Program 3 : Can you overload constructors in Java?
        Constructor Overloading means having multiple constructors with different parameter
         lists in the same class.
         Give one example, Write a code for that.
         */
        student1 s1 = new student1();
        s1.display();

        student1 s2 = new student1(100,"Vikash");
        s2.display();

        student1 s3 = new student1(101);
        s3.display();
    }
}

class student1{
    int roll;
    String name;

    public student1(){
        roll = 0;
        name = "xyz";
    }

    public student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public student1(int roll){
        this.roll=roll;
    }

    public void display(){
        System.out.println("Roll: " + roll + " & " + " Name: "+name);
    }
}
