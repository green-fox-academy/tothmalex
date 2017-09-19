import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TrialReading {

    public static void main(String[] args) {
        Path myPath = Paths.get("src/TrialFile.txt");
        List<String> lines = null;
        List<String> newList = new ArrayList<>();
        newList.add("Hello All");

        try {
            Files.write(myPath, newList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            lines = Files.readAllLines(myPath);
        } catch (IOException e) {
            System.out.println("Unable to read files: TrialFile.txt");
        } finally {
            System.out.println("Try to check your file");
        }
        for (String line: lines) {
            System.out.println(lines);
        }
    }
}
