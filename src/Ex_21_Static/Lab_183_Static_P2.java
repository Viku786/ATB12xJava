package Ex_21_Static;

public class Lab_183_Static_P2 {
    public static void main(String[] args) {

        ATB vikash = new ATB(870949327,"Vikash");
        ATB vicky = new ATB(751922175,"Vicky");
        System.out.println(vikash.phone_no);
        System.out.println(vicky.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
    }
}

class ATB{

    int phone_no;
    String name;
    static String course_name ="ATB";

    public ATB(int phone_no,String name){
        this.phone_no=phone_no;
        this.name=name;
    }

    void display(){
        System.out.println(this.phone_no + this.name + course_name);
    }

    static void markAttendance (){
        System.out.println("Mark Attendance");
    }
}