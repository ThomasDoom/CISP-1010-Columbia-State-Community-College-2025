import java.util.Scanner;

public class GenderPercentage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Introduction
        System.out.println("\nThis program will ask you to give information on how many males/females are in a single class.");
        System.out.println("\nAnswer the following with a number:");

        
        // Gather User's Input on Male/Female Counts
        System.out.print("Females: ");
        int females = keyboard.nextInt();

        System.out.print("Males: ");
        int males = keyboard.nextInt();


        // Store Total Class Size For Percentage Equation
        double classSize = males + females;

        // Calculate Percentages
        int malePercentage = (int) (males / classSize * 100);
        int femalePercentage = (int) (females / classSize * 100);

        // Display Calculated Percentages Back To User
        System.out.println("\nPercentage of Female students in class: " + femalePercentage + "%");
        System.out.println("Percentage of Male students in class: " + malePercentage + "%\n");


        keyboard.close();
        }
}
