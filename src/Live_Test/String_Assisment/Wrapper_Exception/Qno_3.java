package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Arrays;
import java.util.Scanner;

public class Qno_3 {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        GenericSwap.swap(intArray, 0, 2); // swap indices 0 and 2
        System.out.println(" " + Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C"};
        GenericSwap.swap(strArray, 0, 1); // swap indices 0 and 1
        System.out.println(" " + Arrays.toString(strArray));
    }
}

class GenericSwap {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}