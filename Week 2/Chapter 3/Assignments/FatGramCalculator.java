import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User Input
        System.out.println("\n___ Food Fat Percentage Calculator ___");

        // Calories
        System.out.print("\nCalories:\t");
        int totalCal = keyboard.nextInt();

        // Fat
        System.out.print("Grams of Fat:\t");
        int fatGrams = keyboard.nextInt();

        // Grams to Calories Conversion For Fat Variable
        int fatCal = fatGrams * 9;
        System.out.printf("Cal. From Fat:\t%dcal%n", fatCal);

        // Error If [fatCal] Conversion Exceeds [Calories] Input
        if (fatCal > totalCal) {
            System.out.println("\n***ERROR... Invalid Inputs (Calories From Fat Exceeds Total Calories Inputted)***\n");
        } else { 
            // Fat % Calculated & Multiplied x100 Then Displayed
            double FatPercentage = (fatCal / (double) totalCal) * 100;
            System.out.printf("Fat Percentage:\t%.1f%%%n%n", FatPercentage);
            
            // Displays Low/High Fat Foods [< 30%]
            if (FatPercentage < 30) {
                System.out.println("This food is low in fat!\n");
            } else {
                System.out.println("That's... a lot of fat...\n");
            }
        }
        keyboard.close();
    }
}