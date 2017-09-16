import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int numberIn;
        int sum = 0;
        int a;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number:\n ");
        numberIn = keyboard.nextInt();

        int length = (int) (Math.log10(numberIn) + 1);

        System.out.println(length);

        while (numberIn > 0) {
            a = numberIn % 10;
            numberIn = numberIn / 10;
            sum += sum + Math.pow(a, (int) Math.log10(numberIn) + 1);
        }
        System.out.println("Sum of Digits :" + sum);

        if (numberIn == sum) {
            System.out.println("The " + numberIn + " is an Armstrong number.");
        } else {
            System.out.println("The " + numberIn + " is NOT an Armstrong number.");
        }
    }
}

//Write a simple program to check if a given number is an armstrong number.
// The program should ask for a number. E.g. if we type 371, the program should print out:
// The 371 is an Armstrong number.
