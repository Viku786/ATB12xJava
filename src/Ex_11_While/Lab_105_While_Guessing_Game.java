package Ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_105_While_Guessing_Game {
    public static void main(String[] args) {

        // Guess number between 1 to 100
        //n=50
        //g = 80

        Random random= new Random();
        int numberToGuess = random.nextInt(100)+1;
        //System.out.println(numberToGuess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int guess;
        int attempts = 0;

        while (true){

            if (!sc.hasNextInt()){
                System.out.println("Invaid Input ! Please enter a number");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;


            if (guess < 1 || guess > 100){
                System.out.println("Please enter number between 1 to 100");
                continue;
            }


            if (guess <numberToGuess){
                System.out.println("To low , try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high , try again");
            }
            else{
                System.out.println("Correct! you guessed it in " +attempts +" Attempts : ");
                break;
            }
        }


    }
}
