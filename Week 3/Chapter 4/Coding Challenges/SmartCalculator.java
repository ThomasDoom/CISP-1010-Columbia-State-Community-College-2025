import java.util.Scanner;

public class SmartCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("=== Smart Calculator ===");

        int choice;
        do {
            // Display Menu
            System.out.println("MENU:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Multiple Operations");
            System.out.println("6. Exit");

            // Get Valid Menu Option
            do {
                System.out.print("Choose option (1 - 6): ");
                choice = kb.nextInt();
                if (choice < 1 || choice > 6) {
                    System.out.println("*** Invalid Input. Please Enter 1-6 ***");
                }
            } while (choice < 1 || choice > 6);

            if (choice >= 1 && choice <= 6) {
                // Single Operator Mode
                System.out.print("Enter First Number: ");
                double firstNum = kb.nextDouble();
                System.out.print("Enter Second Number: ");
                double secondNum = kb.nextDouble();

                // Get Results and Assign Operator to display later
                String operation = "";
                double result = 0;
                boolean validOperation = true;
                switch (choice) {
                    case 1 -> {
                        result = firstNum + secondNum;
                        operation = "+";
                    }
                    case 2 -> {
                        result = firstNum - secondNum;
                        operation = "+";
                    }
                    case 3 -> {
                        result = firstNum * secondNum;
                        operation = "+";
                    }
                    case 4 -> {
                        if (firstNum != 0 && secondNum != 0){
                            result = firstNum / secondNum;
                            operation = "+";
                        } else {
                            System.out.println("Cannot Divide By Zero!!!.. Nice Try... Go again.");
                            validOperation = false;
                        }
                    }
                }

                // Display Results
                if (validOperation) {
                    System.out.printf("Result: %.1f %s %.1f = %.1f%n", firstNum, operation, secondNum, result);
                }

            } else if (choice == 5) {
                // Multiple Operations
                

            } else if (choice == 6) {
                // Exit Message
            }
        } while (choice != 6);

        kb.close();
    }
}
