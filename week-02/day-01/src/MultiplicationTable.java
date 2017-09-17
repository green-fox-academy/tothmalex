import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int input;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        input = keyboard.nextInt();

        for (int i = 0; i <11 ; i++) {
            System.out.println(i+" * "+input+" = "+i*input);
        }
    }
}
