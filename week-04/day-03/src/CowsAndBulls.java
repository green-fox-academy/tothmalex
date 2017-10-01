import java.util.Scanner;
public class CowsAndBulls {

    String theNumber = "1756"; //for now
    boolean status; //playing or finished
    int guess;

    public CowsAndBulls() {

    }

    //number generator method
    public String theNumberMaker() {
        this.theNumber = String.valueOf((int)(Math.random() * ((10000 - 999) + 1) + 999));
        return this.theNumber;
    }

    //guess & compare guessed and theNumber
    public void play(){
        int cows = 0;
        int bulls = 0;
        this.guess = 0;
        status = true; //still playin

        while (status) {
            Scanner userInput = new Scanner(System.in);
            String guessed = userInput.nextLine();

            for (int i = 0; i < 4; i++) {
                if (guessed.charAt(i) == theNumber.charAt(i)) {
                    cows++;
                } else if (theNumber.contains(String.valueOf(guessed.charAt(i)))) {
                    bulls++;
                } if (cows == 4){
                    status = false; //not playing anymore
                }
            }

            this.guess++;

            if (!status) {
                System.out.println("You have guessed the number correctly, and it only took You " + this.guess + " tries!");
                break;
            }

            System.out.println("In " + guess + " guess(es), You have gathered " + cows + " cow(s) and " + bulls + " bull(s)! Keep guessing.");
            cows = 0;
            bulls = 0;
        }
    }

    public static void main(String[] args) {
        CowsAndBulls gameOne = new CowsAndBulls();
        gameOne.theNumberMaker();
        System.out.println("I am thinking of a 4-digit number, take a guess!");
        gameOne.play();
    }
}
