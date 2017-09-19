import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        String name = scanner.nextLine();

        try {
            Path filePath = Paths.get("src/" + name);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.size());
        } catch (IOException e) {
            System.out.println("0");
        }
    }
}



// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
