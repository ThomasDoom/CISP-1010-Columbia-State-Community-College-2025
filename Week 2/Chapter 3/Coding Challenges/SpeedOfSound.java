import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int STEEL_SPEED = 16400; // 16,400 feet per second
        final int WATER_SPEED = 4900; // 4,900 feet per second 
        final int AIR_SPEED = 1100; // 1,100 feet per second

        // User Input => Enter "Air" "Water" Or "Steel"
        System.out.println("Pick a medium:");
        System.out.println("1. Air");
        System.out.println("2. Water");
        System.out.println("3. Steel");
        System.out.print("Enter Choice [1-3]: ");
        int medium = keyboard.nextInt();

        // User Input => Enter a distance the sound will travel (feet)
        System.out.print("Enter a Distance in Feet: ");
        double distance = keyboard.nextInt();

        // Calculate the amount of time it takes to travel that distance
        // Time = Distance / Medium
        double time = 0;
        switch (medium) {
            case 1 -> time = distance / AIR_SPEED;
            case 2 -> time = distance / WATER_SPEED;
            case 3 -> time = distance / STEEL_SPEED;
        }
        System.out.printf("It will take %.2f Seconds to travel 1%.0f Feet.", time, distance);
        
        keyboard.close();
    }
}
