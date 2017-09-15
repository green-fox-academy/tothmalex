/*import java.util.Scanner;

public class Anagram2 {

    public static void main(String[] args) {

        String s;
        String t;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number:\n ");
        s = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the second number:\n ");
        t = keyboard2.nextLine();

        boolean anagram;
    }

        public boolean anagram(String s, String t) {

            if (s.length() != t.length())
                return false;

            int value = 0;
            for (int i = 0; i < s.length(); i++) {
                value += ((int) s.charAt(i)) ^ 2;
                value -= ((int) t.charAt(i)) ^ 2;
            }
            return value == 0;

            System.out.println(anagram);
        }

    }
}
*/