package Java_Project_Notepad;

import java.util.Scanner;

public class Notepad_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int number = sc.nextInt();

        if((number % 4 ==0 && number % 100 != 0) || (number % 400 ==0)){
            System.out.println("The following year "+number+ " is leap year");
        }
        else{
            System.out.println("The following year "+number+ " is not a leap year");
        }
    }


}
