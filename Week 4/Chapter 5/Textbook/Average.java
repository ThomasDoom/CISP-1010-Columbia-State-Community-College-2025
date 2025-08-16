public class Average {
    public static void main(String[] args) {
        double var1 = 12.73,
               var2 = 30.24,
               av   = average(var1, var2);

        System.out.println(av);

    }

    /**
     * Returns average of 2 input doubles
     *
     * @param x The first double
     * @param y The second double
     * @return Average of x and y
     */

    public static double average(double x, double y) {

        double avg = (x + y) / 2;

        return avg;
    }
}
