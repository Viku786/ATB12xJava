package Ex_21_Static;

public class Lab_186_Static {
    public static void main(String[] args) {

        Automation a1 = new Automation();
        System.out.println(a1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);

    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2;
}