import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final double BURGER_PRICE = 12.99;
        final double PIZZA_PRICE = 15.99;
        final double SALAD_PRICE = 9.99;
        final double SANDWICH_PRICE = 8.99;
        final double PASTA_PRICE = 14.99;

        final double TAX_RATE = 0.085;

        // Display menu with 5 items
        System.out.println("==== RESTAURANT MENU ====");
        System.out.println("\t1. Burger - $12.99");
        System.out.println("\t2. Pizza - $15.99");
        System.out.println("\t3. Salad - $9.99");
        System.out.println("\t4. Sandwich - $8.99");
        System.out.println("\t5. Pasta - $14.99\n");

        System.out.println("Welcome to our Restaurant!");

        // Get Item Selection (1-5)
        System.out.print("What would you like to order? (1-5) ");
        int order = kb.nextInt();
        while (order < 1 || order > 5) {
            System.out.printf("We don't have a number %d here...%n", order);
            System.out.println("Would you like anything that we have?... (1-5) ");
            order = kb.nextInt();
        }
        // Match Order To Item Price
        double itemPrice = 0;
        switch (order) {
            case 1 -> itemPrice = BURGER_PRICE;
            case 2 -> itemPrice = PIZZA_PRICE;
            case 3 -> itemPrice = SALAD_PRICE;
            case 4 -> itemPrice = SANDWICH_PRICE;
            case 5 -> itemPrice = PASTA_PRICE;
        }

        // Get Quantity (1-20)
        System.out.print("Perfect! How many would you like? ");
        int quantity = kb.nextInt();
        while (quantity < 1 || quantity > 20) {
            if (quantity > 20)
                System.out.println("Uhm... You can only order a maximum of 20... fatty");
            else
                System.out.println("You dont want any of it?? Or you want to give some to us? No, thanks...");
            System.out.print("Lets try again, How many would you like? ");
            quantity = kb.nextInt();
        }

        // Display Subtotal
        double subtotal = itemPrice * quantity;
        System.out.printf("Your subtotal is: $%.2f%n", subtotal);

        // Get Payment Amount (>= total cost)
        System.out.print("Ok and your payment amount? $");
        double payment = kb.nextDouble();
        while (payment < subtotal) {
            System.out.println("That's not enough...");
            System.out.print("How much do you want to pay? $");
            payment = kb.nextDouble();
        }

        // Calculate Bill
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        double change = payment - total;

        // Display Bill:
        // Subtotal
        // Tax (8.5%)
        // Total
        // Change (if any)
        System.out.printf("%nSubtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
        if (change >= 0.005)
        System.out.printf("Change: $%.2f", change);


        // ignore this:
        // Ask if they want to order another item
        // Keep track of total items ordered

        kb.close();
    }
}
