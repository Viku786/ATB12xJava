package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_3 {
    public static void main(String[] args) {

        /* Implement encapsulation in a class "Employee" with private attributes
        "id", "name", and "salary". Add getter and setter methods.
         */

        Employee e = new Employee("BB-101","Vikash",35000l);
        e.EmployeeDetails();
    }
}

class Employee{
    private String id;
    private  String name;
    private  long salary;

    public Employee(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void EmployeeDetails(){
        System.out.println("Employee ID: "+id+ " , Employee Name: "+name+ " , Employee Salary: "+salary);
    }
}