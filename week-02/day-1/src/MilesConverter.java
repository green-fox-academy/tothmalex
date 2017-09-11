import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {

    double miles;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the number of miles ");
    miles = keyboard.nextInt();

    double kilometers = miles * 1.609344;
    System.out.println(miles + " miles is equal to " + kilometers + " kilometers ");
    }
}