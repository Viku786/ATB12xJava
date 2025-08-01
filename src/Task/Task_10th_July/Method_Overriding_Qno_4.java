package Task.Task_10th_July;

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