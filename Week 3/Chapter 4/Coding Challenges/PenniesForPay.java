import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        /* Calculate the amount a person would earn over a period of time
        if their salary begins at one penny and doubles daily*/

        // Input Validation: Number Of Days Has To Be > 1
        int days;
        do {
            System.out.print("Enter a Number of Days: ");
            days = kb.nextInt();
            if (days < 1) {
                System.out.println("*** Invalid Input ***");
            }
        } while (days < 1);

        int pennies = 1;
        for (int i = 1; i <= days; i++) {
            System.out.println(pennies);
            pennies *= 2;
        }
        System.out.println(pennies);
        // Display the salary for each day
        // Display the total pay at the end of the period in $00.00 amount, not the number of pennies
        kb.close();
    }
}
