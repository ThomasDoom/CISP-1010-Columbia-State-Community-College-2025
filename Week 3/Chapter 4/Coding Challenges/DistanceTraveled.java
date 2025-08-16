import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        // Ask for speed of a vehicle (MPH) and the # of hours its traveled
        System.out.println("\nEnter the speed of a vehicle and the number of hours traveled");

        // Get Valid Speed
        int speed;
        do {
            System.out.print("Speed (MPH): ");
            speed = kb.nextInt();
            if (speed < 0)
            System.out.println("*** Enter A Positive Integer ***");
        } while (speed < 0);

        // Get Valid Time
        int time;
        do {
            System.out.print("Hours: ");
            time =  kb.nextInt();
            if (time < 1)
                System.out.println("*** Hours Must Be Greater Than 1 ***");
        } while (time < 1);

        System.out.println("             Distance");
        System.out.println(" Hour        Traveled");
        System.out.println("----------------------");

        // Loop to display the distance the vehicle has traveled each hour
        int distance;
        for (int i = 1; i <= time; i++) {
            distance = speed * i;   // Distance = Speed * Time
            System.out.printf("  %d             %d%n", i, distance);
        }

        System.out.println("");
        kb.close();
    }
}
