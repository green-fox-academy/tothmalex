import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number with which you wanna divide 10:");
        int divisor = scanner.nextInt();

        try {                                   // Prevents the program breaking when attempting dividing by zero
            int result = 10 / divisor;          // If the input value for divisor was 0 it stops the try block
            System.out.println(result);         // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            System.out.println("Fail!"); // This line only runs if the input was 0
        }
    }
}

// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0
