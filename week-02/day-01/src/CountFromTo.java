import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        int numberFirst;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number:\n ");
        numberFirst = keyboard.nextInt();

        int numberSecond;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the second number:\n ");
        numberSecond = keyboard2.nextInt();

        if (numberSecond>numberFirst){
            for (int i = 0; i < (numberSecond-numberFirst); i++) {
                System.out.println(i+numberFirst);
            }
        } else {
            System.out.println("The second number should be bigger.");
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5