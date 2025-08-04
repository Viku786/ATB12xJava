package Task.Task_10th_July;

import Task.Task_11th_July.Student1;

public class Method_Overriding_Qno_4 {
    public static void main(String[] args) {

        /* 🔹 Task 4: Login Functionality
            Title: Different login behaviors for users
            Description:
            Create a class User with method login() that prints “User login”.
            Create subclasses AdminUser and RegularUser, each overriding login()
            with their own logic/messages.
            Demonstrate calling the login() method using base class reference
            to highlight runtime polymorphism.
         */

        User u;

        u = new AdminUser();
        u.login();

        u = new RegularUser();
        u.login();

        /*
        This task is used to run the program, of Task 11th July of Program_7
         */
        Student1 s = new Student1();   // Accessible in  different package
        s.showInfo();
    }
}

class User{
    void login(){
        System.out.println("User login");
    }
}

class AdminUser extends User{
    @Override
    void login() {
        System.out.println("Admin User login");
    }
}

class RegularUser extends User{
    @Override
    void login() {
        System.out.println("Regular User login");
    }
}