package Ex_21_Static;

public class Lab_182_static {
    public static void main(String[] args) {

        student s1 = new student(23);
        student s2 = new student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(student.course_Name);
        System.out.println(s1.course_Name);
        System.out.println(s2.course_Name);

        student.m1();
    }
}

class student{
    int age; //Non-static or Attribute or Instance Variable
    static String course_Name = "ATB12x";

    public student(int age_c){
            this.age=age_c;
    }

    static void m1(){
        System.out.println("I am static method");
    }
}