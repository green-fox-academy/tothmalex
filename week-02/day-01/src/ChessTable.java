import java.util.Scanner;

public class ChessTable {
    public static void main(String[] args) {
        int size;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number:\n ");
        size = keyboard.nextInt();

        String square = "";
        for (int i = 0; i < size; i++) {
            if (i == 0 || i % 2 == 0) {
                square += " ";
                for (int j = 0; j < size; j++) {
                    square += "%";
                }
            } else {
                for (int j = 0; j < size; j++) {
                    square += "%";
                }
            } square += "\n";
        } System.out.println(square);
    }
}



// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//