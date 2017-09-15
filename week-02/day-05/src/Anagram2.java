import java.util.Scanner;

public class Anagram2 {

    public static void main(String[] args) {

        String wordFirst;
        String wordSecond;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first word:\n ");
        wordFirst= keyboard.nextLine();

        System.out.print("Enter the second word:\n ");
        wordSecond = keyboard.nextLine();

        System.out.println(anagramCheck(wordFirst, wordSecond));
    }
        public static boolean anagramCheck(String input1,String input2) {

            if (input1.length() != input2.length()) {
                return false;
            } else { int value = 0;
            for (int i = 0; i < input1.length(); i++) {
                value += ((int) input1.charAt(i)) ^ 2;
                value -= ((int) input2.charAt(i)) ^ 2;
            }
            return value == 0;
        }

    }
}
