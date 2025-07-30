package Ex_26_Generic;

public class Lab_222_Generic_Class {
    public static void main(String[] args) {

        GenericClass g1 = new GenericClass(10);
        GenericClass g2 = new GenericClass("Vikash");
        GenericClass g3 = new GenericClass(3.45);
        GenericClass g4 = new GenericClass(true);
    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}