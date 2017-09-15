import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        String wordFirst;
        String wordSecond;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first word:\n ");
        wordFirst = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the second word:\n ");
        wordSecond = keyboard2.nextLine();

        boolean isAnagram = false;

        if (wordFirst.length() == wordSecond.length()) {
            char[] s1AsChar = wordFirst.toCharArray();
            char[] s2AsChar = wordSecond.toCharArray();
            Arrays.sort(s1AsChar);
            Arrays.sort(s2AsChar);
            isAnagram = Arrays.equals(s1AsChar, s2AsChar);
            System.out.println(isAnagram);
        } else {
            System.out.println(isAnagram);
        }
    }
}