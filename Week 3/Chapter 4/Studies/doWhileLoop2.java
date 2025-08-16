import java.util.Scanner;

public class doWhileLoop2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        long number = 1;
        long maxVal = 300;
        int i = 0;

        do {
            number *= 2;
            i++;
        } while(number < maxVal && i < 20);

        kb.close();
    }
}
