package Ex_09_Switch;

import java.util.Scanner;

public class Lab069_Switch {
    public static void main(String[] args) {

        //You need to take user input and ask for the Integer from 1 to 7
        //And if the user input 1 to 7
        // then you tell which day will be

        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);

        int n=1;
        if(sc.hasNextInt()){
            n=sc.nextInt();
        }
        else{
            System.out.println("Please enter Integer values lies between 1 to 7");
        }


        switch (n){
            case 1 :
            {
                System.out.println("Monday");
                break;
            }
            case 2 :
            {
                System.out.println("Tuesday");
                break;
            }
            case 3 :
            {
                System.out.println("Wednesday");
                break;
            }
            case 4 :
            {
                System.out.println("Thrusday");
                break;
            }
            case 5 :
            {
                System.out.println("Friday");
                break;
            }
            case 6 :
            {
                System.out.println("Saturday");
                break;
            }
            case 7 :
            {
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.println("Please enter valid day, Thanks");
        }
    }
}
