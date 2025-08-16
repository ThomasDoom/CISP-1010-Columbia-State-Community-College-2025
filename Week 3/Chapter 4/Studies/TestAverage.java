import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Get # of students
        System.out.print("Students: ");
        int students = kb.nextInt();

        // Get # of tests per student
        System.out.print("Tests Per Student: ");
        int tests = kb.nextInt();

        // Iterate Students
        int total;
        int score;
        for (int student = 1; student <= students; student++) {
            total = 0; // Reset total so each student starts the count on 0

            // Iterate Tests
            System.out.println("Student Number " + student);
            System.out.println("-----------------");
            for (int test = 1; test <= tests; test++) {
                System.out.print("Enter Score " + test + ": ");
                score = kb.nextInt();
                total += score; // Add scores to total for avg later
            }

            // Get and Display avg for current student
            double average = total / tests;
            System.out.printf("The average for student %d is %.1f.%n%n", student, average);
        }

        kb.close();
    }
}
