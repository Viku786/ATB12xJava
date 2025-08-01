package Task.Task_9th_July;

public class Multilevel_Login_System {
    public static void main(String[] args) {

        /* ✅ Task 3: "Multilevel Login System"
        📄 Description: (Multilevel Inheritance)
        Create a class User with a method login().
        Extend it with a class AdminUser that adds a method accessAdminPanel().
        Then create a SuperAdmin class that extends AdminUser
        and adds a method shutdownSystem().
        Use an object of SuperAdmin to call all three methods.
         */
        SuperAdmin sa = new SuperAdmin();
        sa.shutDownSystem();
        sa.accessAdminPanel();
        sa.login();
    }
}

class User{
    void login(){
        System.out.println("User login the system");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Admin has all access");
    }
}

class SuperAdmin extends AdminUser{
    void shutDownSystem(){
        System.out.println("Shut down system");
    }
}

