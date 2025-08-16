import java.io.IOException;
import java.io.PrintWriter;

public class PrimeNumberList {
    public static void main(String[] args) throws IOException {
        final int MAX_RANGE = 100;        // Set range

        makeListOfPrimeNumber(MAX_RANGE); // Print prime numbers to file
    }

    /**
     * Prints all prime numbers until the max range onto a separate file
     * @param maxRange The maximum range the algorithm will search for prime numbers
     * @param file The output file being printed to
     * @exception Throws IOException if the file does not exist
     */
    public static void makeListOfPrimeNumber(int maxRange) throws IOException {
        PrintWriter outputFile = new PrintWriter("primeNumberList.txt");
        // Evaluate each number from 2 - max
        for (int i = 2; i <= maxRange; i++) {
            boolean prime = isPrime(i);
            if (prime)
                outputFile.println(i);
        }
        outputFile.close();
    }

    /**
    * Checks if [number] is a prime number or not by iterating through each possible factor besides 1
    *
    * Link for math references: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    *
    * @param number The integer being checked
    * @return Prime => true  ||  else => false
    */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) { // Iterate through each possible factor
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
