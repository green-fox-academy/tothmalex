import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        double number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number:\n ");
        number = keyboard.nextInt();

        if (number > 0) {
            if ( number<=2) {
                if (number == 1) {
                    System.out.println("One");
                } else {
                    if (number == 2) {
                        System.out.println("Two");
                    }
                }
            }else{
                System.out.println("A lot");
            }

        } else {
            System.out.println("Not enough");
        }
    }
}