package Ex_25_Object;

public class Sample extends Object {

    @Override
    public String toString() {
        System.out.println("This is coming from Object class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("This is coming from Object class");
        return  0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("This is coming from Object class");
        return true;
    }
}
