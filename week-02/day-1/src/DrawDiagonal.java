import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        int size;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the size of the square:\n ");
        size = keyboard.nextInt();

        String square = "";
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    square += "%";
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == i || j == size - 1) {
                        square += "%";
                    } else {
                        square += " ";
                    }
                }
            }
            square += "\n";
        }
        System.out.println(square);
    }
}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
