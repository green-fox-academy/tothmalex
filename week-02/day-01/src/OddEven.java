import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        double number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number:\n ");
        number = keyboard.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


