package Live_Test.String_Assisment.Java_OOPs_and_Exception_Handling;

import java.util.Scanner;

public class Qno_15 {
    public static void main(String[] args) {

        /* Create a custom exception class "InvalidAgeException"
         and throw it if age is less than 18.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age1 = sc.nextInt();

        try {
            AgeValidator.validateAge(age1);
        } catch (invalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class invalidAgeException extends Exception{
    public invalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator{
    public static void validateAge (int age) throws invalidAgeException{
        if (age < 18){
            throw new invalidAgeException("InvalidAgeException: Age must be 18 or above. Entered Age : "+age);
        }else {
            System.out.println("Age is valid: "+age);
        }
    }
}