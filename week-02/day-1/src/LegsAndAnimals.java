import java.util.Scanner;

public class LegsAndAnimals {
    public static void main(String[] args) {

        int numberFirst;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of chickens at the farm:\n ");
        numberFirst = keyboard.nextInt();

        int numberSecond;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the number of pigs at the farm:\n ");
        numberSecond = keyboard2.nextInt();

        int allChickenLegs = numberFirst*2;
        int allPigsLegs = numberSecond*4;

        System.out.println("Number of legs at the farm: " +(allChickenLegs+allPigsLegs));
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have