import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Initialize Fee Constants (im just playing around with [final] i know this is unnecessary)
        final double BASE_FEE = 10.00;
        final double CHECKS_UNDER_20 = 0.10;
        final double CHECKS_20_TO_39 = 0.08;
        final double CHECKS_40_TO_59 = 0.06;
        final double CHECKS_60_PLUS = 0.04;

        // User Input ==> Monthly Checks Written
        System.out.println("\nHow many checks have you written this month?");
        int checks = keyboard.nextInt();

        // Set Cost Per Check Rate
        double checkFeeRate;
        if (checks >= 60) {
            checkFeeRate = CHECKS_60_PLUS;
        } else if (checks >= 40) {
            checkFeeRate = CHECKS_40_TO_59;
        } else if (checks >= 20) {
            checkFeeRate = CHECKS_20_TO_39;
        } else {
            checkFeeRate = CHECKS_UNDER_20;
        }
        
        // Calculate Total Fees
        double checkFees = checks * checkFeeRate;
        double totalFees = BASE_FEE + checkFees;
        
        // Displaying Service Fees With Fancy Layout :) 
        // also unecessary but fun and makes the console output look very clean
        System.out.println("\n__ MONTHLY SERVICE CHARGES __");
        System.out.printf("Cost Per Check:        $%5.2f%n", checkFeeRate);
        System.out.printf("Checks Written:        %5d%n", checks);
        System.out.printf("Check Fee:             $%5.2f%n", checkFees);
        System.out.printf("Bank Fee:              $%5.2f%n", BASE_FEE);
        System.out.println("------------------------------");
        System.out.printf("This Month's Charges:  $%5.2f%n%n", totalFees);

        keyboard.close();
    }        
}
// %[flags][width][.precision]conversion