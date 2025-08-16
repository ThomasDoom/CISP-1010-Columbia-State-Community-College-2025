public class Accumulator {
    // Fields
    private int sum;

    // Constructors
    public Accumulator() {
        this.sum = 0;
    }

    // Getters
    public int getSum() {
        return sum;
    }

    // Setters


    // Methods
    public void add(int value) {
        this.sum += value;
    }

}
