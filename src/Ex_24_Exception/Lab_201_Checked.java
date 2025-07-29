package Ex_24_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_201_Checked {
    public static void main(String[] args) {

        /*
        Checked Exception -> JVM knows about it
        During compilation JVM said that it is the case when file is not found
        This may lead file not found exception
        so, it required to handle it
         */
        try {
            FileInputStream fileInputStream = new FileInputStream("c:/log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
