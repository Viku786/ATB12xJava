package Ex_24_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_212_Interview_P2 {
    public static void main(String[] args) {

        try {
            FileReader f1 = new FileReader("C://bug.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
