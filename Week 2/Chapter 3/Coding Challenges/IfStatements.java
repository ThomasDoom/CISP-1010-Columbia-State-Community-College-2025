import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = keyboard.nextInt();

        if (score >= 60) {
            System.out.println("Passing");
        }

        keyboard.close();
    }    
}
