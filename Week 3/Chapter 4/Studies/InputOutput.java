import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String fileName = kb.nextLine();

        /* ------------------
        * WRITE DATA TO A FILE
        ------------------ */

        // Create an instance of File so we can check its existence
        File myFile = new File(fileName);
        if (myFile.exists()) {
            // Create an instance of FileWriter to control append
            // [true] = APPEND
            // [false] = CREATE NEW FILE AND WIPE
            FileWriter fWriter = new FileWriter(fileName);
            // Create an instance of PrintWriter to save data
            PrintWriter outputFile = new PrintWriter(fWriter);

            outputFile.println("Halloo! bieg summuh bloughout :]");
            outputFile.println("vatt??");
            outputFile.close();
        } else {
            System.out.println("ERROR: File doesn't exist. Create new (Y/N)? ");
        }

        /* -------------------
        * READ DATA FROM A FILE
        ------------------- */

        // Create an instance of file to link fileName for Scanning
        // File myFile = new File(fileName);
        if (myFile.exists()) {
            // Create an instance of Scanner to read a file
            Scanner inputFile = new Scanner(myFile);

            // Loop all the lines of texr in the file
            String lineOfText = "";
            System.out.println("The File's Text:");
            while (inputFile.hasNext()) {
                lineOfText = inputFile.nextLine();
                System.out.println(lineOfText);
            }

            inputFile.close();
            kb.close();
        }
    }
}
