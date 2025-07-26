package Ex_18_OOPS_Constructor;

public class Lab_158_Car {
    public static void main(String[] args) {

        Car Tesla = new Car();
        Tesla.name = "Tesla Madel 3";
        Tesla.year=2025;
        System.out.println(Tesla.name);
        System.out.println(Tesla.year);
        System.out.println(Tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);

        LoginPage l = new LoginPage();
    }
}
