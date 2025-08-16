import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        File myFile;
        String fileName;
        // User input file name
        do {
            System.out.print("Enter file name: ");
            fileName = kb.nextLine();
            myFile = new File(fileName);

            if (!myFile.exists())
                System.out.println("ERROR: File Does Not Exist!");
        } while (!myFile.exists());

        // User input character
        System.out.print("Enter a character to count: ");
        var character = kb.next();

        /*---------
        * Read File
        ---------*/

        Scanner inputFile = new Scanner(myFile);

        int count = 0;
        String text = "";
        // Count and display the number of times that specified character appears in the file
        while (inputFile.hasNext()) {
            text = inputFile.next();

            if (text.equals(character))
                count++;
        }

        System.out.printf("The character '%s' appears in the file %s %d times.", character, fileName, count);
        inputFile.close();
        kb.close();
    }
}
