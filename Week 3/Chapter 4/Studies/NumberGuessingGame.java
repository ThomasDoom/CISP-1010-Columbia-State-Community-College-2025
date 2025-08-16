import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Get Random Number Bewteen 1-50
        int randNum = (int)(Math.random() * 50) + 1;

        int userGuess = 0;
        int guessCount = 0;

        System.out.println("I'm thinking of a number bewteen 1 - 50... ");

        while (userGuess != randNum) {
            System.out.print("\nEnter your guess: ");
            userGuess = kb.nextInt();
            if (userGuess < 1 || userGuess > 50)
                System.out.println("\n*** WAIT!! Make Sure You're Guessing Between 1 - 50! ***");
            else {
                guessCount++;
                if (userGuess < randNum)
                    System.out.println("\nToo Low! Try Higher.");
                else if (userGuess > randNum)
                    System.out.println("\nToo High! Try Lower.");
            }
        }

        System.out.println("\nCONGRATS YOU GOT IT!!");
        System.out.printf("It took you %d tries :)%n%n", guessCount);

        kb.close();
    }
}
