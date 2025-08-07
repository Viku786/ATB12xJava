package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_7 {
    public static void main(String[] args) {

        /* Create an Employee base class and Manager, Developer subclasses.
        Each should have different salary calculation methods.

        Input:
        Manager with base salary 60000 and bonus 10000,
        Developer with hourly rate 50 and 160 hours
        Output:
        Manager Salary: 70000.0 Developer Salary: 8000.0
         */

        Employees manager = new Manager("Vikash",60000,10000);
        System.out.println("Manager Salary: "+manager.calculateSalary());

        Employees developer = new Developer("Vicky",50,160);
        System.out.println("Developer Salary: "+developer.calculateSalary());
    }
}

class Employees{
    String name;
    double baseSalary;

    public Employees(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return 0;
    }
}

class Manager extends Employees{
    double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+bonus;
    }
}

class Developer extends Employees{
    double hourlyRate;
    double hoursWorked;

    public Developer(String name,double hourlyRate, double hoursWorked){
        super(name,0);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}