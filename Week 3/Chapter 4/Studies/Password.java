import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String validPassword = "Java123";

        String userInput;
        do {
            System.out.print("Enter password: ");
            userInput = input.nextLine();
        } while (!userInput.equals(validPassword));
        // DONT USE != FOR STRINGS ||| its String.equals()
        System.out.println("Password Accepted");

        input.close();
    }
}
