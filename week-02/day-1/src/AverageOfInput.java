import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five integer number e.x. 23 34 2..etc.:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int sum = a + b + c + d + e;
        int avg = sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}


// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4