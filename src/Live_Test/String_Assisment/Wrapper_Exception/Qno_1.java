package Live_Test.String_Assisment.Wrapper_Exception;

import java.util.Scanner;

public class Qno_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidException("Age must be 18 or older.");
            } else {
                System.out.println("Valid age: "+age);
            }

        } catch (InvalidException e) {
            System.out.println("InvalidAgeException: "+e.getMessage());
        }


    }
}

class InvalidException extends Exception{
    public InvalidException (String message){
        super(message);
    }
}

