public class PrintEven {
    public static void main(String[] args) {
        printEven(45);
    }

    /**
     * Displays if input is odd or even
     * @param x Input tested
     */

    public static void printEven(int x) {
        if (x % 2 == 0)
            System.out.printf("The value %d is even", x);
        else
            System.out.printf("The value %d is odd", x);
    }
}
