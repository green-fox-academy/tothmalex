package countchars;

        import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        // Create a function that takes the filepath (e.g. "da_vinci_code.txt") as an input, reads the given file, and counts the occurences of 0, 1 and x characters in it.
        // The function should return a dictionary in which the searched characters are the keys and the number of their occurences are the values.
        // Use the uploaded da_vinci_code.txt file in this folder in the repo to test your program.
        // For example:
        //
        // Map<String, Integer> countedLetters = countLetters("da_vinci_code.txt");
        // System.out.println("0 occured " + countedLetters.get("0") + " times in the file.");
        // System.out.println("1 occured " + countedLetters.get("1") + " times in the file.");
        // System.out.println("x occured " + countedLetters.get("x") + " times in the file.");
        //
        // Should print:
        // 0 occured 3393 times in the file.
        // 1 occured 3375 times in the file.
        // x occured 3232 times in the file.
        Map<String, Integer> countedLetters = countLetters("da_vinci_code.txt");
        System.out.println("0 occured " + countedLetters.get("0") + " times in the file.");
        System.out.println("1 occured " + countedLetters.get("1") + " times in the file.");
        System.out.println("x occured " + countedLetters.get("x") + " times in the file.");
    }


    private static Map<String,Integer> countLetters(String input) {
        Map<String, Integer> counter = new HashMap<>();
        try {
            Path myPath = Paths.get("C:\\Users\\TMA\\Documents\\greenfox1\\tothmalex\\week-06\\day-04.2\\src\\countchars\\da_vinci_code.txt");
            List<String> txtFile = Files.readAllLines(myPath);
            for (int i = 0; i < txtFile.size(); i++) {
                String lines = txtFile.get(i);
                for (int j = 0; j < lines.length(); j++) {
                    String letter = String.valueOf(lines.charAt(j));
                    if (counter.containsKey(letter)) {
                        int count = counter.get(letter);
                        counter.put(letter, ++count);
                    } else {
                        counter.put(letter, 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        return counter;
    }
}