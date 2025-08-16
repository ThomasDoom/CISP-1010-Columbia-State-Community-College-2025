import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // ask user for positive non zero int
        int num;
        do {
            System.out.print("Enter a positive integer: ");
            num = kb.nextInt();
            if (num < 0) {
                System.out.println("*** Invalid Input ***");
            }
        } while (num < 0);

        // use loop to get sum of all integers from 1 up to the number entered
        System.out.print("\nCalculation: 1");

        int sum = 1;
        for (int i = 2; i <= num; i++) {
            System.out.print(" + " + i);
            sum += i;
        }

        System.out.println(" = " + sum + "\n");
        kb.close();
    }
}
