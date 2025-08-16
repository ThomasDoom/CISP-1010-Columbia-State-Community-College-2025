import java.util.Scanner;

public class CookieCalories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declaring and Setting Variables
        // int totalCookies = 40; without math.min or if statements this is useless
        int servingSize = 10;
        int calPerServing = 300;
        // Calculating the Calories in a Single Cookie
        int calPerCookie = calPerServing / servingSize;


        // User Input => Cookies Eaten
        System.out.println("\nHow many cookies did you eat?...");
        System.out.println("(NOTE: There's only 40 cookies in a bag!)");
        int cookiesEaten = keyboard.nextInt();
        // Calculates Total Calories Consumed by User
        int calConsumed = cookiesEaten * calPerCookie;

        // Display Total Calories Consumed
        System.out.println("\nCONGRATS!! You've consumed a total of " + calConsumed + "cal from " + cookiesEaten + " cookies!\n");


        keyboard.close();
    }
}
