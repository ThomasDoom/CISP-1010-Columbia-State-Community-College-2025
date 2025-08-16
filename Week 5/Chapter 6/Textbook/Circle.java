public class Circle {
    // Fields
    private double radius;
    private double pi = 3.1415;

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.pi * Math.pow(getRadius(), 2);
    }

    public double getCircumference() {
        return 2 * this.pi * getRadius();
    }
    // Setters
    public void setRadius(double radius) {
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    // Methods
    public String describe() {
        return "This is a circle with a radius equal to " + getRadius() + " .";
    }
}