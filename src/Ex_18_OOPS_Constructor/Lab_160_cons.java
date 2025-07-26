package Ex_18_OOPS_Constructor;

public class Lab_160_cons {
    public static void main(String[] args) {

        Car2 Tesla = new Car2();
        System.out.println(Tesla.model);
        System.out.println(Tesla.year);

        Car2 nano = new Car2("Tata Nano", 2011);
        System.out.println(nano.model);
        System.out.println(nano.year);

        Car2 mghector = new Car2("MG Hector", 2011);
        System.out.println(mghector.model);
        System.out.println(mghector.year);
    }
}
