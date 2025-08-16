public class LightSetting {
    // Fields
    private int brightnessLevel;
    private String color;

    // Constructors
    public LightSetting(String color) {
        setBrightnessLevel(50);
        setColor(color);
    }

    // Getters
    public int getBrightnessLevel() { return brightnessLevel; }
    public String getColor() { return color; }

    // Setters
    public void setBrightnessLevel(int brightnessLevel) { this.brightnessLevel = brightnessLevel; }
    public void setColor(String color) { this.color = color; }

    // Methods

}
