import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            int compNum = rand.nextInt(3) + 1;
            String compChoice = getChoice(compNum);

            System.out.print("Enter rock, paper, or scissors: ");
            String userChoice = input.nextLine().toLowerCase();

            if (!isValid(userChoice))
                System.out.println("** Invalid input **");
            else {
                System.out.println("Computer chose: " + compChoice);
                String result = getWinner(userChoice, compChoice);
                System.out.println(result);
                if (!result.contains("tie"))
                    break;
            }
        }
        input.close();
    }

    public static String getChoice(int num) {
        if (num == 1) return "rock";
        else if (num == 2) return "paper";
        else return "scissors";
    }

    public static boolean isValid(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "It's a tie! Play again.";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock")))
            return "You win!";
        return "Computer wins!";
    }
}