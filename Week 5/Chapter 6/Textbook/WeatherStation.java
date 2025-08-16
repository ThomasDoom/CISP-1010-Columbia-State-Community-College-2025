public class WeatherStation {
    // Fields
    private double temperature;
    private double humidity;
    private boolean rainStatus;

    // Getters
    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
    public boolean isRaining() { return rainStatus; }

    // Setters
    public void setTemperature(double temperature) { this.temperature = temperature; }
    public void setHumidity(double humidity) { this.humidity = humidity; }
    public void setRainStatus(boolean rainStatus) { this.rainStatus = rainStatus; }

    // Methods
    public String displayWeather() {
        String rain;
        if (isRaining())
            rain = "Yes";
        else
            rain = "No";
        return "Temperature: " + getTemperature() + " degrees C, Humidity: " + getHumidity() + "%, Rain: " + rain;
    }

    public void updateWeather(double temperature, double humidity, boolean rainStatus) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.rainStatus = rainStatus;
    }
}
