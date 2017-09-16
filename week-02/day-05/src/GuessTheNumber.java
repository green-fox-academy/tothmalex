import java.util.Scanner;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the minimum value of the range: ");
        int minRange = scanner.nextInt();
        System.out.println("Please enter the maximum value of the range: ");
        int maxRange = scanner.nextInt();
        int random = (minRange + 1) + (int) (Math.random() * (maxRange - 1));
        int guess = random;
        int lives = 5;
        boolean win = false;

        while (win == false) {
            System.out.println("Please enter your guess: ");
            guess = scanner.nextInt();
            lives--;
            if (lives == 0) {
                System.out.println("No more lives left! Sorry, you lost, you NOOB!");
                break;
            }
            if (guess == random) {
                win = true;
                System.out.println("Congrats! You are awesome!");
            } else if (guess < random) {
                System.out.println("Too low! Try a bit bigger!" + "You have " + lives + " lives left!");
            } else if (guess > random) {
                System.out.println("Too high! Try a bit lower!" + "You have " + lives + " lives left!");
            }
        }
    }
}

// Write a program where the program chooses a number between 1 and 100.
// The player is then asked to enter a guess. If the player guesses wrong, then the program gives
// feedback and ask to enter an other guess until the guess is correct.
//  Make the range customizable (ask for it before starting the guessing).

