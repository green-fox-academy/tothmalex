import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedLines02 {
    public static void main(String[] args) {
        reverseText("src/reversed-lines.txt");
    }

    public static void reverseText(String myFile) {
        Path myPath = Paths.get(myFile);
        try {
            List<String> textContent = Files.readAllLines(myPath);
            for (int i = textContent.size(); i > -1; i--) {
                for (int j = textContent.get(i).length()- 1; j > -1; j--) {
                        System.out.print(textContent.get(i).charAt(j));
                    }
                }
            System.out.println(); // not to be forgotten, or everything will be on one line
        } catch (IOException e) {
        }
        System.out.println("Houston, we have a problem");
    }
}