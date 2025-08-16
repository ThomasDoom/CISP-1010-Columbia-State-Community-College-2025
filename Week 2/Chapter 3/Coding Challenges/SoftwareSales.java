import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
 
        final double PRICE = 99.00;
        // User Input => # of Packages Purchased
        System.out.print("Number of Packages Purchased: ");
        int packages = keyboard.nextInt();
        double cost = packages * PRICE;

        // Calculate Discount (If Any)
        double discount;
        if (packages >= 100) {
            discount = 0.50;
        } else if (packages >= 50) {
            discount = 0.40;
        } else if (packages >= 20) {
            discount = 0.30;
        } else if (packages >= 10) {
            discount = 0.20;
        } else {
            discount = 0;
        }  

        // Discount
        double amountDiscounted = cost * discount;
        System.out.printf("--- %.0f%% Discount ---%n", discount * 100);
        System.out.printf("Amount Discounted for %d Packages: $%,.2f%n", packages, amountDiscounted);


        // Total Amount Of Purchase After Discount
        double costDiscounted = cost - amountDiscounted;
        System.out.printf("Original Cost: $%,.2f%n", cost);
        System.out.printf("Discounted Cost: $%,.2f%n", costDiscounted); 


        keyboard.close();
    }
}
