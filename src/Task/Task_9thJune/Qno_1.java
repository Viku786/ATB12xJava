package Task.Task_9thJune;

public class Qno_1 {
    public static void main(String[] args) {
        /* 1) Student Class Constructor
           Create a class Student with a constructor to initialize name and age.
           Print both using a display method.
         */

        Student s1 = new Student("Vikash",23);
        s1.display();
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

}
