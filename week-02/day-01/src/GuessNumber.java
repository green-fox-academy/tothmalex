import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = 13;
        int numberGuess;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the guessed number:\n ");
        numberGuess = keyboard.nextInt();

        if (numberGuess == number) {
            System.out.println("The stored number is 13. Congrats!");
        } else if (numberGuess > number) {
            System.out.println("The stored number is lower.");
        } else if (numberGuess < number) {
            System.out.println("The stored number is higher");
        } else {}
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8