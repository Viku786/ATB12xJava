package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

public class Qno_1 {
    public static void main(String[] args) {

        /* Create a class "Person" with attributes "name" and "age".
        Create two instances and print their details.
         */

        Person p = new Person("Vikash",25);
        Person p1 = new Person("Vicky",27);

        p.display();
        p1.display();
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+name+ " Age: "+age);
    }
}