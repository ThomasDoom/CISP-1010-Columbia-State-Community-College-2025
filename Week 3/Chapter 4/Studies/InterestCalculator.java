import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Get Principal
        double principal;
        do {
            System.out.print("Enter Principal Amount: ");
            principal = kb.nextDouble();
            if (principal < 100) {
                System.out.println("*** Minimum Principal: $100.00 ***");
            }
        } while (principal < 100);

        // Get Annual Interest Rate
        double annualInterestRate;
        do {
            System.out.print("Enter Annual Interest Rate: ");
            annualInterestRate = (kb.nextDouble() / 100);
            if (annualInterestRate < 0.1 || annualInterestRate > 50) {
                System.out.println("*** Must Enter A Rate Between [0.1% - 50%] ***");
            }
        } while (annualInterestRate < 0.1 || annualInterestRate > 50);

        // Get # of Years
        int time;
        do {
            System.out.print("Number of years: ");
            time = kb.nextInt();
            if (time < 1 || time > 50) {
                System.out.println("*** Must be 1 - 50 years ***");
            }
        } while (time < 1 || time > 50);

        System.out.println("Year    Simple Interest     Compound Interest   Difference");
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= time; i++) {
            double compoundInterest = principal * Math.pow(1 + annualInterestRate, i);
            double simpleInterest = principal * annualInterestRate * i;
            System.out.printf( "%d        $%,.2f               $%,.2f            $%,.2f%n", i, simpleInterest, compoundInterest, (compoundInterest - simpleInterest));
        }

        kb.close();
    }
}
