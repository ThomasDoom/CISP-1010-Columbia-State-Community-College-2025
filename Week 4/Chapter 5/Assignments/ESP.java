import java.util.Random;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        // This is something I took directly from an online resource
        // All it does is reset your terminal's text format when you [CTRL + C] to stop the running program
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.print("\033[0m");
        }));

        final int ROUNDS = 10;

        displayIntro(ROUNDS);                // Display Intro
        int correct = gameLoop(ROUNDS, kb, random);  // Game Loop Returns Correct Guesses
        displayResults(correct, ROUNDS);     // Results

        kb.close();
    }

    /**
     * Displays the introduction and the available colors to choose from
     * @param totalRounds The number of rounds in the game loop
     */
    public static void displayIntro(int totalRounds) {
        System.out.println("\n\033[1;37m╔═════════════════════════════════════════╗");
        System.out.println("║      \033[1;95m#   \033[1;36mMIND   READING   TEST\033[1;95m   #      \033[1;37m║");
        System.out.println("╚═════════════════════════════════════════╝\n");
        System.out.println("I will think of a color from this list:\n");
        System.out.println(" -  " + getColoredString("Red"));
        System.out.println(" -  " + getColoredString("Green"));
        System.out.println(" -  " + getColoredString("Blue"));
        System.out.println(" -  " + getColoredString("Orange"));
        System.out.println(" -  " + getColoredString("Yellow"));
        System.out.println("\nIt's your task to guess which one I've picked.");
        System.out.printf("You've got %d rounds to test your ESP powers!%n", totalRounds);
    }

    /**
     * Goes through the main game loop for all rounds
     * @param totalRounds The total rounds in a single game loop
     * @param input Scanner for user input
     * @return The number of correct guesses
     */
    public static int gameLoop(int totalRounds, Scanner input, Random random) {
        int correct = 0;
        for (int round = 1; round <= totalRounds; round++) {
            String color = getRandomColor(random);       // Get Random Color
            String guess = getGuess(input, round); // Get Player Guess
            if (evaluateGuess(color, guess))       // Check Guess
                correct++;
        }
        return correct;
    }

    /**
     * Prompts the player for their color guess
     * @param userInput Scanner object for user input
     * @param currentRound Current round number
     * @return Player's color guess
     */
    public static String getGuess(Scanner userInput, int currentRound) {
        System.out.printf("%nRound %d: ", currentRound);
        return userInput.nextLine();
    }

    /**
     * Evaluates the player's guess with the random color and displays the result
     * @param color The randomly selected color
     * @param guess The player's Guess
     * @return true if the guess is correct, false otherwise
     */
    public static boolean evaluateGuess(String color, String guess) {
        boolean isCorrect = guess.equalsIgnoreCase(color);

        if (isCorrect)
            System.out.println(colorText("\nCORRECT!! ", "\033[1;38;5;46m") +
                               colorText("+ 1 Point!", "\033[1;38;5;3m"));
        else
            System.out.println(colorText("\nINCORRECT...", "\033[1;31m"));
        System.out.println("I was thinking of: " + getColoredString(color));
        System.out.println();
        return isCorrect;
    }

    /**
     * Displays final results at the end of the game loop
     * @param correct The number of correct guesses made
     * @param rounds The number of rounds in the game loop
     */
    public static void displayResults(int correct, int rounds) {
        System.out.printf("%nThat's the end of the %d rounds!", rounds);
        System.out.printf("%nYour Score: %s%n", colorText(correct + "/" + rounds, "\033[1;38;5;3m"));
        System.out.println("\033[0m");
    }

    /**
     * Gets random color selection from these 5: [Red, Green, Blue, Orange, Yellow]
     * @param random A random number object
     * @return A random color string
     */
    public static String getRandomColor(Random random) {
        // Generate random index number
        int colorIndex = random.nextInt(5);

        switch (colorIndex) {
            case 0:  return "Red";
            case 1:  return "Green";
            case 2:  return "Blue";
            case 3:  return "Orange";
            case 4:  return "Yellow";
            default: return "Red";
        }
    }

    /**
     * Helper to change text color format to a string
     * @param text The string being colored
     * @param ansiCode The ANSI sequence being applied to the text
     * @return Colored string
     */
    public static String colorText(String text, String ansiCode) {
        return ansiCode + text + "\033[37m";
    }

    /**
     * Gets the color name formatted with its corresponding ANSI sequence
     * @param color The name of the color
     * @return The color name with it's corresponding ANSI code
     */
    public static String getColoredString(String color) {
        switch (color.toLowerCase()) {
            case "red":    return colorText("Red", "\033[1;31m");          // Bold red
            case "green":  return colorText("Green", "\033[1;38;5;2m");    // Bold green
            case "blue":   return colorText("Blue", "\033[1;38;5;27m");    // Bold blue
            case "orange": return colorText("Orange", "\033[1;38;5;208m"); // Bold orange
            case "yellow": return colorText("Yellow", "\033[1;38;5;3m");   // Bold yellow
            default:       return color;
        }
    }
}

