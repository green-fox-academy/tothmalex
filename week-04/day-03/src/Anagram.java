import java.util.Arrays;

public class Anagram {

    public boolean ifAnagram (String wordOne, String wordTwo) {
        char[] word1 = wordOne.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = wordTwo.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}



   /* Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
        Create a test for that.*/