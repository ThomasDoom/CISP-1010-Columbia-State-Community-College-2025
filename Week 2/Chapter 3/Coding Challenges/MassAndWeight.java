import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User Input => Object's Mass
        System.out.print("Enter Object's Mass: ");
        double mass = keyboard.nextDouble();

        // Calculate It's Weight In Newtons | Weight = Mass * 9.8
        double weight = mass * 9.8;

        System.out.printf("Objects Weight (N): %.2fN%n", weight);

        // Check If Object's Mass is > 1000 Newtons or Less than 10
        // 1000 = Too Heavy | 10 = Too Light
        if (weight > 1000)
            System.out.println("Object is too heavy!");
        else if (weight < 10)
            System.out.println("Object is too light...");
        
        keyboard.close();
    }
}
