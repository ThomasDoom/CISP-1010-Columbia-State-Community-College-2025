public class Temperature {
    // Fields
    double celsius;

    // Constructors
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getters and Setters
    public double getCelsius() { return celsius; }
    public void setCelsius(double celsius) { this.celsius = celsius; }

    // Methods
    public double calculateFahrenheit() {
        return (getCelsius() * (9.0/5) + 32);
    }

    public double calculateKelvin() {
        return (getCelsius() + 273.15);
    }

    public void displayConversions() {
        System.out.println("Celcius: " + getCelsius());
        System.out.println("Fahrenheit: " + calculateFahrenheit());
        System.out.println("Kelvin: " + calculateKelvin());
    }
}