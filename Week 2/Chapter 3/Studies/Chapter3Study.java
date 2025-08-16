import java.util.Scanner;

public class Chapter3Study {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean result = false;

        while (!result) {
            System.out.println("Name the best color");
            String color = keyboard.nextLine();
            result = (color.equalsIgnoreCase("Purple"));
        }
        // if (name.equalsIgnoreCase("John")) {
        //     System.out.println("That is definitely your name!");
        // } else {
        //     System.out.println("Liar...");
        // }

        keyboard.close();
    }
}