import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        int numberGirl;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many girls are coming?:\n ");
        numberGirl = keyboard.nextInt();

        int numberBoy;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("How many boys are coming?:\n ");
        numberBoy = keyboard2.nextInt();

        if (numberGirl != 0) {

            if (numberBoy + numberGirl > 20) {

                if (numberBoy == numberGirl) {
                    System.out.println("The party is excellent!");
                } else {
                    System.out.println("Quite cool party!");
                }
            } else {
                System.out.println("Average party... ");
            }
        } else {
            System.out.println("Sausage party!");
        }
    }
}


// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
