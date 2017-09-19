import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    public static void main(String[] args) {

        List<String> content = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path:");
        String path = scanner.nextLine();
        System.out.println("Enter the word:");
        String word = scanner.nextLine();
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        for (int i = 0; i <number ; i++) {
            content.add(word);
        }

            try {
                Path filePath = Paths.get(path);
                Files.write(filePath, content);
            } catch (IOException e) {
                System.out.println("Unable to write file: my-name.txt!");
            }
        }
    }


// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
