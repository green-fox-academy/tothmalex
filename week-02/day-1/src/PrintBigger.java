import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        int numberFirst;
        int numberSecond;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the two numbers:\n ");

        numberFirst = keyboard.nextInt();
        numberSecond = keyboard.nextInt();3

        if (numberFirst>numberSecond) {
            System.out.println(numberFirst);
        } else {
            System.out.println(numberSecond);
        }
    }
}

// Write a program that asks for two numbers and prints the bigger one

