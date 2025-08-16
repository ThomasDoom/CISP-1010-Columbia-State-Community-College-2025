package Other;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayFileOperations {
    public static void main(String[] args) {

    }

    public static void processFile(String inputFile, String outputFile) throws IOException {
        File input = new File(inputFile);
        File output = new File(outputFile);

        try (PrintWriter writer = new PrintWriter(output);
             Scanner scanner = new Scanner(input)) {

            while (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                int square = n * n;

                writer.printf("The square of %d is %d.%n", n, square);
            }
            //Please insert your code here.
        }
        catch (Exception e) {
            System.err.println("Error processing file: " + e.getMessage());
        }


    }
}
