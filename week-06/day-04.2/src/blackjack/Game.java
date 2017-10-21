package blackjack;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        int opponentScore = (int) (Math.random() * ((21 - 15) + 1)) + 15;
        int playerScore = 0;
        Deck d = new Deck();
        d.shuffleDeck();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings. You are up against Jóska. Press y to begin!");

        while (playerScore <= 21 && scanner.nextLine().equals("y")) {
            playerScore += d.pullFirst().getValue();
            if (playerScore > 21) {
                break;
            }
            System.out.println("Your score is: " + playerScore + " Do you want to draw another card?");
        }

        if (playerScore > 21) {
            System.out
                    .println("You lost, you suck, and yo mama so dumb she makes Donald Trump look smart!");
        } else if (playerScore < opponentScore) {
            System.out.println("Your score is " + playerScore + " and Jóska's score is " + opponentScore
                    + " seems like you lost.");
        } else {
            System.out.println(
                    "Jóska's score is " + opponentScore + ". "
                            + "Seems like you won. Perhaps you don't suck that much.");
        }
    }
}