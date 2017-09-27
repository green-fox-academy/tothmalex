import java.util.HashMap;

public class CountLetters {

        public Integer mapping (String input){

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                Integer val = map.get(new Character(c));
                if (val != null) {
                    map.put(c, new Integer(val + 1));
                } else {
                    map.put(c, 1);
                }
            }
            return map.size();
        }
}

 /*   Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
        Create a test for that.*/