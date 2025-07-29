package Ex_24_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_213_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f1 = new FileReader("C://bug.txt");
    }
}
