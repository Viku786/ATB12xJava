package Task.Task_7th_june;

public class SingleInheritance {
    public static void main(String[] args) {

        //1.  Single Inheritance

        BaseTest bt = new BaseTest();
        bt.Launch_Browser();
        bt.loginTest();
    }
}
class ParentTest{
    public void Launch_Browser(){
        System.out.println("Chrome browser launched");
    }
}

class BaseTest extends ParentTest{
    public void loginTest(){
        System.out.println("Excuting Base test ");
    }
}