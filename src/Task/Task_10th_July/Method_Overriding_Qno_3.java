package Task.Task_10th_July;

public class Method_Overriding_Qno_3 {
    public static void main(String[] args) {

        /* 🔹 Task 3: Employee Role Info
            Title: Show employee roles with overridden methods
            Description:
            Create a class Employee with method role() printing “General Employee”.
            Create child classes Manager, Clerk, Tester, each overriding role()
            to print their specific roles.
            Call role() on each object to show how overriding helps in specialization.
         */

        Employee e;

        e = new Clerk();
        e.role();

        e = new Manager();
        e.role();

        e = new Tester();
        e.role();
    }
}

class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    @Override
    void role() {
        System.out.println("Manager");
    }
}

class Clerk extends Employee{
    @Override
    void role() {
        System.out.println("Clerk");
    }
}

class Tester extends Employee{
    @Override
    void role() {
        System.out.println("Tester");
    }
}