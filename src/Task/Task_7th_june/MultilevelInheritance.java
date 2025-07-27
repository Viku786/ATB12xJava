package Task.Task_7th_june;

public class MultilevelInheritance {
    public static void main(String[] args) {

        //3.  Multilevel Inheritance

        login l1 = new login();
        l1.login();
        l1.initialze();

        System.out.println("----------------------");

        BaseTest1 bs1 = new BaseTest1();
        bs1.Browser();
        bs1.initialze();

        System.out.println("-----------------");

        FrameWork f1 = new FrameWork();
        f1.initialze();

        FrameWork f2 = new BaseTest1();
        f2.initialze();

        //BaseTest1 bt2 = new FrameWork();

    }
}

class FrameWork{
    public void initialze(){
        System.out.println("FrameWork is initialzed");
    }
}

class BaseTest1 extends FrameWork{
    public void Browser(){
        System.out.println("Browser set up done");
    }
}

class login extends FrameWork{
    public void login(){
        System.out.println("Login successfully");
    }
}