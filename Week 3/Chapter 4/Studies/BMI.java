import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("\nThis program will calculate your BMI.\n");

        // Get Patient Name
        System.out.print("Enter your name: ");
        String name = kb.nextLine();

        System.out.println("\nWhat is your height in [feet] then [inches]?");
        // Get Feet Then Validate [2 - 8ft]
        System.out.print(" Feet: ");
        int feet = kb.nextInt();
        while (feet < 2 || feet > 8) {
            System.out.println("**Invalid Input. Try again**");
            System.out.print(" Feet: ");
            feet = kb.nextInt();
        }

        // Get Inches Then Validate [0 - 11in]
        System.out.print(" Inches: ");
        int inches = kb.nextInt();
        while (inches < 0 || inches > 11) {
            System.out.println("**Invalid Input. Try again**");
            System.out.print(" Inches: ");
            inches = kb.nextInt();
        }

        // Get Weight Then Validate [35 - 800lbs]
        System.out.print("What's your weight (lbs): ");
        double weight = kb.nextDouble();
        while (weight < 35 || weight > 800) {
            System.out.println("**Invalid Weight. Try again**");
            System.out.print(" Weight (lbs): ");
            weight = kb.nextDouble();
        }

        // Total Height In Inches
        int totalInches = (feet * 12) + inches;
        // BMI Calculation
        double bmi = weight * 703 / Math.pow(totalInches, 2);

        // BMI categories
        String bmiCategory;
        if (bmi < 18.5)
            bmiCategory = "Underweight";
        else if (bmi < 25)
            bmiCategory = "Normal weight";
        else if (bmi < 30)
            bmiCategory = "Overweight";
        else
            bmiCategory = "Obese";

        // Display Patient's Data
        System.out.println("\n┌─────────────────────────────────────────────────┐");
        System.out.println("│               BMI CALCULATION REPORT            │");
        System.out.println("└─────────────────────────────────────────────────┘");
        System.out.printf(" Patient      : %s%n", name);
        System.out.println("───────────────────────────────────────────────────");
        System.out.printf(" Height       : %d feet %d inches (%d inches total)%n", feet, inches, totalInches);
        System.out.printf(" Weight       : %.1f pounds%n", weight);
        System.out.println("───────────────────────────────────────────────────");
        System.out.printf(" Your BMI is  : %f%n", bmi);
        System.out.printf(" Category     : %s%n", bmiCategory);
        System.out.println("───────────────────────────────────────────────────");
        System.out.println();
            
        kb.close();
    }
}











