package Task.Task_7th_june;

public class HierarchicalInheritance {
    public static void main(String[] args) {

        //2. Hierarchical Inheritance

        child1 ch1 = new child1();
        ch1.login();
        ch1.Launch_Browser();

        System.out.println("----------------------");

        child2 ch2 = new child2();
        ch2.signup();
        ch2.Launch_Browser();
    }
}

class Base{
    public void Launch_Browser(){
        System.out.println("Chrome browser launched");
    }
}

class child1 extends Base{
    public void login(){
        System.out.println("Login Successful");
    }
}

class child2 extends Base{
    public void signup(){
        System.out.println("Signup successfully");
    }
}