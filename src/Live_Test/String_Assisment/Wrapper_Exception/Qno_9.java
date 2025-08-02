package Live_Test.String_Assisment.Wrapper_Exception;

public class Qno_9 {
    public static void main(String[] args) {

        try {
            ExceptionPropagation.method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");
        }
    }
}

class ExceptionPropagation{

    static void method1(){
        method2();
    }

    static void method2(){
        method3();
    }

    static void method3(){
        int result = 10/0;
        System.out.println("Result: "+result);
    }
}