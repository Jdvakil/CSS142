import java.util.Random;
import java.util.Scanner;
/**
 * This is a game that generates a random number and asks the user for their input until they guess it right. it tells the user if their input is too high
 * or too low. 
 * @author Jay Darshan Vakil
 * @version 02/22/2019
 */
public class GuessingGame{
    public static void main(String[] args) {
        //Declaring variables
        int secret, guess,count=0;
        //Creating the Random class object
        Random r = new Random();
        // Scanner object is used to get the inputs entered by the user
        Scanner sc = new Scanner(System.in);
        //This loop will continue to execute until the user enters either 'Y' or 'y'
        while (true) {
            //generating the random number
            secret = r.nextInt(101);
            //this loop continues to execute until the user correctly guesses the number;
            while (true) {
                //Getting the user guess entered by the user
                System.out.print("Guess the number (Between 1-100):");
                guess = sc.nextInt();
                if (guess == secret) {
                    System.out.println("Good job, you got it after "+count+" guesses!");
                    break;
                } else {
                    if (guess > secret) {
                        System.out.println("Too high! Guess again");
                        count++;
                        continue;
                    } else {
                        System.out.println("Too low! Guess again");
                        count++;
                        continue;
                    }
                }
            }
            // Getting the character from the user 'Y' or 'y' or 'N' or 'n'
            System.out.print("\nDo you want to Play Again(Y/N):");
            char ch = sc.next(".").charAt(0);
            if (ch == 'Y' || ch == 'y')
                continue;
            else {
                System.out.println("Thanks for playing the game!!");
                break;
            }
        }
    }
}