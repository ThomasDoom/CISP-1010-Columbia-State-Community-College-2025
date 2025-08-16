import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a month in numeric form: ");
        int month = keyboard.nextInt();

        System.out.print("Enter a day: ");
        int day = keyboard.nextInt();

        System.out.print("Enter a year in 2-digit form: ");
        int year = keyboard.nextInt();

        if (month * day == year) {
            System.out.println("The date is magical");
        } else {
            System.out.println("Not magical...");
        }

        
        keyboard.close();
    }
}
