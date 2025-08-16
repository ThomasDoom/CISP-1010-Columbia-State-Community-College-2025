public class Rectangle {
    // Fields
    private double length,
                   width;

    // Constructors
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength() { return length; }
    public double getWidth()  { return width; }

    // Setters
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width)   { this.width = width; }

    // Methods
    public double calculateArea() {
        return getLength() * getWidth();
    }

    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public boolean isSquare() {
        return getLength() == getWidth();
    }

    // Comparison Methods
    public boolean equals(Rectangle other) {
        return (other.getLength() == getLength() && other.getWidth() == getWidth());
    }

    public boolean isLargerThan(Rectangle other) {
        return other.calculateArea() < calculateArea();
    }

    public boolean isSmallerThan(Rectangle other) {
        return other.calculateArea() > calculateArea();
    }

    // Transformer Methods
    public void scaleBy(double factor) {
        setLength(getLength() * factor);
        setWidth(getWidth() * factor);
    }

    public static int compare(Rectangle r1, Rectangle r2) {
        if (r1.equals(r2))
            return 0;
        else if (r1.isLargerThan(r2))
            return 1;
        else
            return -1;
    }
}