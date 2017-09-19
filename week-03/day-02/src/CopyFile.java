import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source file name:");
        String fileSor = "src/" + scanner.nextLine();
        System.out.println("Enter the destination file name:");
        String fileDes = "src/" + scanner.nextLine();

        System.out.println(copyFile(fileSor, fileDes));
    }
    public static boolean copyFile(String input, String input2) {

        boolean status = false;
        Path filePath = Paths.get(input);
        Path filePath2 = Paths.get(input2);

        try {
            List<String> lines = Files.readAllLines(filePath);
            Files.write(filePath2, lines);
            List<String> lines2 = Files.readAllLines(filePath2);
            status = lines.equals(lines2);
        } catch (IOException e) {}
        return status;
    }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
