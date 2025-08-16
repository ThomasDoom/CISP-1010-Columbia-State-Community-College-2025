import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final int MIN_LENGTH = 1;
        final int MAX_LENGTH = 15;

        // Get Valid Input For Square's Length [minLength - maxLength]
        int length;
        boolean validLength;
        do {
            System.out.printf("\nEnter a number [%d - %d]: ", MIN_LENGTH, MAX_LENGTH);
            length = kb.nextInt();

            // Check Input [min <= USER INPUT <= max]
            validLength = (length >= MIN_LENGTH && length <= MAX_LENGTH);
            if (!validLength)
                System.out.println("** Invalid Input **");
        } while (!validLength);

        System.out.println();

        // Print Square
        for (int i = 0; i < length; i++) {    // Loop Row
            for (int j = 0; j < length; j++)  // Loop Column
                System.out.print("X");  // Print "X" * [length] Per Row
            System.out.println();       // New Line To Move To Next Row
        }

        System.out.println();
        kb.close();
    }
}
