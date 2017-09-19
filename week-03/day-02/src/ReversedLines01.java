import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines01s {

    public static void main(String[] args) {
        decrypt("src/reversed-lines.txt");
    }

    public static void decrypt(String fileName){

        Path pathFile = Paths.get(fileName);
        String orgString = "";
        StringBuilder newText = new StringBuilder();
        String correctString = "";

        try {
            List<String> orgList = Files.readAllLines(pathFile);
            orgString = orgList.toString();

            int a = (orgString.length()-1);
            for (int i = a; i > -1; i--) {
                newText.append(orgString.charAt(i));
            }
            System.out.println(newText);
        } catch (IOException e) {
        }
    }
}

