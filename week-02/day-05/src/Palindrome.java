import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String wordIn;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the word:\n ");
        wordIn= keyboard.nextLine();

        System.out.println(palindrome(wordIn));
    }
    public static String palindrome (String input) {
        for (int i = (input.length()-1); i > -1; i--) {
            input += input.charAt(i);
}
        return input;
    }
}
