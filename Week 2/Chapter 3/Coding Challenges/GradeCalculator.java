import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = keyboard.nextInt();
        String letterGrade;

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                letterGrade = "A";
            }
            else if (grade >= 80) {
                letterGrade = "B";
            }
            else if (grade >= 70) {
                letterGrade = "C";
            }
            else if (grade >= 60) {
                letterGrade = "D";
            }
            else {
                letterGrade = "F";
            }

            System.out.println("Your Grade: " + letterGrade);

        } else {
            System.out.println("Invalid Grade...");
        }


        keyboard.close();
    }    
}
