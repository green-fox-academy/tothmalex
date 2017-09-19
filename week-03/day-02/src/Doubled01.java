import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled01 {

    public static void main(String[] args) {
        decrypt("src/duplicated-chars.txt");
    }
    public static void decrypt(String fileName){

        Path pathFile = Paths.get(fileName);
        String duplicateString = "";
        StringBuilder newText = new StringBuilder();
        String correctString = "";

        try {
            List<String> duplicateList = Files.readAllLines(pathFile);
            duplicateString = duplicateList.toString();
            for (int i = 1; i < duplicateString.length(); i+= 2) {
                newText.append(duplicateString.charAt(i));
            }
            System.out.println(newText);

        } catch (IOException e) {

        }
    }
}
// Create a method that decrypts the duplicated-chars.txt