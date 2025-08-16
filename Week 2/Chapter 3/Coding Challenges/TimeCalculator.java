import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User Input => Number of Seconds
        System.out.print("Enter a Number of Seconds: ");
        int seconds = keyboard.nextInt();

        int daysInSeconds = 84600;
        int hoursInSeconds = 3600;
        int minutesInSeconds = 60;

        // >84600 Seconds -> Display # Days in That Many Seconds
        if (seconds >= daysInSeconds) {
            int days = seconds / daysInSeconds;
            System.out.printf("Days In %,d Seconds: %d Days%n", seconds, days);

        // >3600 Seconds -> Display # Hours in That Many Seconds
        } else if (seconds >= hoursInSeconds) {
            int hours = seconds / hoursInSeconds;
            System.out.printf("Hours In %,d Seconds: %d Days%n", seconds, hours);

        // >60 seconds -> Display # Minutes in That Many Seconds
        } else if (seconds >= minutesInSeconds) {
            int minutes = seconds / minutesInSeconds;
            System.out.printf("Minutes In %,d Seconds: %d Days%n", seconds, minutes);
        }




        keyboard.close();
    }
}
