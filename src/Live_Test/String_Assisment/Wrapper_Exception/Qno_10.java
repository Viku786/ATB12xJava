package Live_Test.String_Assisment.Wrapper_Exception;

public class Qno_10 {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        System.out.println("Sum: " + GenericSum.sumArray(intArray));

        // Test with Double array
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum: " + GenericSum.sumArray(doubleArray));
    }
}

class GenericSum {

    public static <T extends Number> double sumArray(T[] array) {
        double sum = 0.0;
        for (T num : array) {
            sum += num.doubleValue();
        }
        return sum;
    }
}