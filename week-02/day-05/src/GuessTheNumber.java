import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {

        int guess;
        int initialNumber;
        int lastNumber;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the inital number of the range:\n ");
        initialNumber = keyboard.nextInt();
        System.out.print("Enter the last number of the range:\n ");
        lastNumber = keyboard.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(lastNumber) + initialNumber;

        while (true) {
            System.out.println("Please enter a number between " + initialNumber + " and " + lastNumber + ":");
            guess = keyboard.nextInt();
            if (guess > initialNumber && guess < lastNumber) {
                if (guess == number) {
                    System.out.println("Congratulations, you found the number: " + number);
                    break;
                } else if (guess > number) {
                    System.out.println("The stored number is lower.");
                } else { System.out.println("The stored number is higher.");
                }
            } else { System.out.println("The guessed number must be between " + initialNumber + " and " + lastNumber + "!");
            }
        }
    }
}

// Write a program where the program chooses a number between 1 and 100.
// The player is then asked to enter a guess. If the player guesses wrong, then the program gives
// feedback and ask to enter an other guess until the guess is correct.
//  Make the range customizable (ask for it before starting the guessing).

