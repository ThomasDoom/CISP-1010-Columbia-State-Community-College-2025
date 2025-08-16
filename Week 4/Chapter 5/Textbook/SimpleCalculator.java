import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an operation (+, -, *, /): ");
        String operation = kb.next();

        System.out.println("Enter the first number: ");
        int a = kb.nextInt();

        System.out.println("Enter the second number: ");
        int b = kb.nextInt();

        double result = 0.0;
        if (operation.equals("+")
         || operation.equals("-")
         || operation.equals("*")
         || operation.equals("/")) {
                switch (operation) {
                    case "+" -> result = add(a, b);
                    case "-" -> result = subtract(a, b);
                    case "*" -> result = multiply(a, b);
                    case "/" -> result = divide(a, b);
                }
                System.out.printf("Result: %.1f", result);
            }

        kb.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0)
            return Double.NaN;
        return a / b;
    }
}
