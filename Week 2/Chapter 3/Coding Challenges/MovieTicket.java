import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();

        System.out.print("Enter your loyalty points: ");
        int loyaltyPoints = keyboard.nextInt();

        double ticketPrice;
        if (age < 12) {
            ticketPrice = 10.00;
        } else if (age < 18) {
            ticketPrice = 12.00;
        } else if (age < 65) {
            ticketPrice = 15.00;
        } else {
            ticketPrice = 13.00;
        }

        System.out.printf("Base Ticket Price: $%.2f%n", ticketPrice);

        double discount;
        if (loyaltyPoints < 100) {
            discount = 0;
        } else if (loyaltyPoints < 200) {
            discount = 0.05;
        } else if (loyaltyPoints < 300) {
            discount = 0.08;
        } else {
            discount = 0.10;
        }

        double discountCalculated = ticketPrice * discount;
        System.out.printf("Discount Amount: $%.2f%n", discountCalculated);
        
        double discountedTicketPrice = ticketPrice - discountCalculated;
        System.out.printf("Final Price: $%.2f%n", discountedTicketPrice);

        keyboard.close();
    }
    
}