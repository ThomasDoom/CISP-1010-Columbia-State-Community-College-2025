import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final int SENTINEL = -99;  // Exit Code

        System.out.printf("%nEnter a series of numbers (\"%d\" to stop):%n", SENTINEL);

        int count = 0,  // Can I initialize multiple variables of the same type like this?
            number,     // The textbook did this and I think it reduces clutter
            min = 0,
            max = 0;
        // Get And Compare Series Of Integers Inputted By User
        do {
            System.out.printf("Number %d: ", count + 1);
            number = kb.nextInt();

            // Skip Process If Exit Code Is Entered (-99)
            if (number != SENTINEL) {

                // Set The [min] And [max] As The First Number Entered => Then Compare Every Time After
                if (++count == 1) {
                    min = number;
                    max = number;
                } else {
                    if (number < min)       // Check New Minimum
                        min = number;
                    else if (number > max)  // Check New Maximum
                        max = number;
                }
            }
        } while (number != SENTINEL);

        System.out.println("\nExiting...\n");

        // Check If First Number Entered Is [-99]
        if (count == 0)
            System.out.println("You didn't enter any numbers...\n");

        // Display Results
        else {
            System.out.printf( "Here are the Smallest and Largest number(s) out of the %d numbers you've entered:%n", count);
            System.out.println("Smallest: " + min);
            System.out.println("Largest: " + max);
            System.out.println();
        }

        // I'm still figuring out the best way to comment/where to comment.
        // I don't want to over-comment either

        kb.close();
    }
}
