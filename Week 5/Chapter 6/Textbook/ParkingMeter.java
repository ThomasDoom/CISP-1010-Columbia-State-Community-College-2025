public class ParkingMeter {
    // Fields
    public int timeLeft;

    // Constructors
    public ParkingMeter() {
        this.timeLeft = 0;
    }

    // Getters


    // Setters


    // Methods
    public boolean add(int value) {
        if (value == 25) {
            this.timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick() {
        if (timeLeft > 0)
            this.timeLeft -= 1;
    }

    public boolean isExpired() {
        if (timeLeft == 0)
            return true;
        return false;
    }
}
