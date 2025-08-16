import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        // Prints the Numbers 1-49 In File Line By Line
        for (int i = 1; i < 50; i++) {
            outputFile.println(i);
        }

        outputFile.close();
    }
}
