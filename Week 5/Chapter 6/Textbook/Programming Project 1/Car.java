public class Car {
    // Fields
    private int yearModel;
    private int speed;
    private String make;

    // Constructors
    public Car(int yearModel, String make) {
        setYearModel(yearModel);
        setMake(make);
        setSpeed(0);
    }

    // Getters
    public int getYearModel() { return yearModel; }
    public int getSpeed() { return speed; }
    public String getMake() { return make; }

    // Setters
    public void setYearModel(int yearModel) { this.yearModel = yearModel; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setMake(String make) { this.make = make; }

    // Methods
    public void accelerate() {
        setSpeed(getSpeed() + 5);
    }

    public void brake() {
        setSpeed(getSpeed() - 5);
    }

}
