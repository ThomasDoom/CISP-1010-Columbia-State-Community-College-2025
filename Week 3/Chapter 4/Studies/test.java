public class test {
    public static void main(String[] args) {

        // Question 20. What will the value [ans] be:
        int x, y = 15, z = 3;
        x = (y--) / (++z);
        System.out.print(x);

        // Q21

        int i = 11;
        int count = 0;
        do
        {
            i += 20;
            count++;
        }
        while (i <= 100);
        System.out.print(count);

    }
}
