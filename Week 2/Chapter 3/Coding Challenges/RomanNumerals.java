import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User Input => # Between 1-10
        System.out.print("Enter a number between 1-10: ");
        int num = keyboard.nextInt();

        // Switch Case # -> [Roman Numeral]
        // Default (Out of range) -> Error
        String romanNum = switch (num) {
            case 1 -> "I"; 
            case 2 -> "II"; 
            case 3 -> "III"; 
            case 4 -> "IV"; 
            case 5 -> "V"; 
            case 6 -> "VI"; 
            case 7 -> "VII"; 
            case 8 -> "VIII"; 
            case 9 -> "IX"; 
            case 10 -> "X";
            default -> "Error"; 
        };

        // Dislpay Result
        System.out.print("Roman Numeral: " + romanNum);

        keyboard.close();
    }
}
