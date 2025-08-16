public class Temperature {
    // Fields
    private double ftemp;

    // Constructors
    public Temperature(double ftemp) {
        setFahrenheit(ftemp);
    }

    // Getters
    public double getFahrenheit() { return ftemp; }
    public double getCelsius() {
        return ((5.0 / 9.0) * (getFahrenheit() - 32));
    }
    public double getKelvin () {
        return (getCelsius() + 273.15);
    }
    // Setters
    public void setFahrenheit(double ftemp) { this.ftemp = ftemp; }

    // Methods

}