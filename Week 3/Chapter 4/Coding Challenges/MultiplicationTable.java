import java.util.Scanner;
import java.util.Random;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String replay,
               quiz;
        Random rand = new Random();
        int userAnswer,
            randNum,
            correct,
            correctAnswer;
        do {
            System.out.println("=== MULTIPLICATION TABLE GENERATOR ===");
            // User Input => Which Multiplation Table (1-12)
            int table;
            do {
                System.out.print("Which Multiplication Table? (1-12): ");
                table = kb.nextInt();
                if (table < 1 || table > 12) {
                    System.out.println("*** Invalid Input ***");
                }
            } while (table < 1 || table > 12);

            System.out.printf("%n=== %d Times Table ===%n", table);
            // Display Multiplication Table For That Number
            int result;
            for (int x = 1; x <= 12; x++) {
                result = table * x;
                System.out.printf("%d x %d = %d%n", table, x, result);
            }

            System.out.print("Do you want to quiz yourself? (Y/N): ");
            quiz = kb.next();

            // Quiz
            if (quiz.equalsIgnoreCase("y")) {
                correct = 0;

                // Series of Questions
                for (int i = 1; i <= 5; i++) {
                    // Get Random Number and product
                    randNum = rand.nextInt(12) + 1; // 1-12
                    correctAnswer = table * randNum;

                    System.out.printf("Question %d: %d x %d = ", i, table, randNum);
                    userAnswer = kb.nextInt();

                    // Grade Answer
                    if (userAnswer == correctAnswer) {
                        System.out.println("Correct!");
                        correct++;
                    } else
                        System.out.println("Wrong! The correct answer is " + correctAnswer);
                }
                // Display Score
                System.out.printf("Quiz Complete! You Scored a %d/5%n", correct);
            }

            // Ask If They Want To See It Again
            System.out.print("\nWould you like to see another table? (Y/N): ");
            replay = kb.next();
        } while (replay.equalsIgnoreCase("y"));

        System.out.println("Thanks For Studying!\n");
        kb.close();
    }
}
