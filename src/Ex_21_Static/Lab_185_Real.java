package Ex_21_Static;

public class Lab_185_Real {
    public static void main(String[] args) {

    }
}

class ATB1{

    {
        System.out.println("IIB - this is called when object is created");
        /* What is the purpose ? -> Here you can write code related to start
        a website or anything before starting the web automation or API
        automation.
         */
    }

    static {
        System.out.println("Load the class? , I will execute");
    }

    private String name; //Non-static
    private String phone;
    static String course_name = "ATB 12x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocument(){
        System.out.println("Non-static method");
        System.out.println(course_name);
    }

    static void doAssignment(){
        /*System.out.println(phone);
        static method can't access non-static variable
         */
        System.out.println("Do Assignmnet");
    }
}
