import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Get Valid Speed
        int speed;
        do {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = kb.nextInt();
        } while (speed < 0);

        // Get Valid Time
        int time;
        do {
            System.out.print("Enter traveling time (in hours): ");
            time =  kb.nextInt();
        } while (time < 1);

        // Loop to display the distance the vehicle has traveled each hour
        int distance;
        for (int i = 1; i <= time; i++) {
            distance = speed * i;   // Distance = Speed * Time
            System.out.printf("After %d hour(s) the distance is %d miles.%n", i, distance);
        }

        kb.close();
    }
}
