import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        final String FILE_NAME = "storeSales.txt";
        final int STORES = 5;
        final int DOLLARS_PER_STAR = 100;

        // Menu Loop [Run Program] OR [Exit]
        int choice;
        do {
            // Display Menu
            System.out.println("\n====  MENU  SELECTION  ====");
            System.out.println("┌─────────────────────────┐");
            System.out.println("│ [ 1 ] Run the Bar Chart │");
            System.out.println("│ [ 2 ] Quit the Program  │");
            System.out.println("└─────────────────────────┘");

            // Get Choice
            do {
                System.out.print("\nWhat would you like to do? [1 - 2]: ");
                choice = kb.nextInt();
                if (choice < 1 || choice > 2) {
                    System.out.println("\n*** Invalid Input! Enter 1 or 2 ***\n");
                }
            } while (choice < 1 || choice > 2);

            // Run Bar Chart
            if (choice == 1) {
                System.out.println("\n┌───────────────────────────────────────────────┐");
                System.out.println("│                   Bar Chart                   │");
                System.out.println("└───────────────────────────────────────────────┘\n");

                /* ----------------------------
                *   WRITE 5 STORE SALES TO FILE
                ---------------------------- */

                PrintWriter outputFile = new PrintWriter(FILE_NAME);

                System.out.println("Enter Today's Sales For Each Store:");
                // Loop To Get Sales Data
                int sales;
                for (int i = 1; i <= STORES; i++) {
                    // Print User Input Sales Into File
                    do {
                        System.out.printf("Store %d: ", i);
                        sales = kb.nextInt();

                        // Only Print Valid Input To File
                        if (sales >= 0)
                            outputFile.println(sales);
                        else
                            System.out.println("\n*** Invalid Input! Must Be Positive Integer ***\n");
                    } while (sales < 0);
                }
                outputFile.close();

                /* -----------------------------------
                *   READ FILE AND DISPLAY BAR CHART
                ----------------------------------- */

                System.out.println("\nGenerating Sales Bar Chart...");

                System.out.println("\n┌──────────┬───────────────────┐");
                System.out.println("│ SALES    │ BAR CHART         │");
                System.out.println("├──────────┼───────────────────┘");

                File storeSales = new File(FILE_NAME);
                Scanner inputFile = new Scanner(storeSales);

                // Loop To Display Each Stores Sales As Bar Chart
                int stars;
                for (int i = 1; i <= STORES; i++) {
                    sales = inputFile.nextInt();
                    stars = sales / DOLLARS_PER_STAR;  // Divide Int By 100 To Get * Count

                    System.out.printf("│ Store %d: │ ", i);

                    // Display Stars
                    for (int j = 0; j < stars; j++)
                        System.out.print("*");

                    // Display Star Count
                    if (stars > 0)
                        System.out.printf(" (%d)", stars);
                    else
                        System.out.printf("(under $%d)", DOLLARS_PER_STAR);

                    // Table Formatting
                    if (i < STORES)
                        System.out.println("\n│          │");
                }
                // Close Table
                System.out.println("\n└──────────┘");

                inputFile.close();

                // Legend
                System.out.printf("%n** Each Star Represents $%d In Sales%n", DOLLARS_PER_STAR);

            // Exit Program
            } else {
                System.out.println("\n┌──────────────────┐");
                System.out.println("│     Goodbye!     │");
                System.out.println("└──────────────────┘\n");
            }

        } while (choice != 2);

        // I hope you enjoyed the cool visuals, it took longer than im willing to admit...

        kb.close();
    }
}
