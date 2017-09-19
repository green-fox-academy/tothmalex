import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubled02 {
    public static void main(String[] args) {
        removeDoubles("src/duplicated-chars.txt");
    }
    public static void removeDoubles(String myFile) {
        Path myPath = Paths.get(myFile);
        try {
            List<String> textContent = Files.readAllLines(myPath);
            for (int i = 0; i < textContent.size(); i++) {
                for (int j = 0; j < textContent.get(i).length() - 1; j += 2) { // length - 1!!!!!
                    if (textContent.get(i).charAt(j) == textContent.get(i).charAt(j + 1)) {
                        System.out.print(textContent.get(i).charAt(j));
                    }
                }
            }
            System.out.println(); // not to be forgotten, or everything will be on one line
        } catch (IOException e) {
        }
        System.out.println("Houston, we have a problem");
    }
}