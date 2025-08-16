public class Rectangle {

    // Fields || Attributes || Properties
    private int length;
    private int width;
    // Defaults:
    // Numbers = 0
    // Booleans = false
    // String = null


    // Constructor (Set Defaults)
    public Rectangle() {
        this.length = 25;
        this.width = 25;
    }

    public Rectangle(int length, int width) {   // Allows you to declare these two when creating an instance of the class
        setLength(length);
        setWidth(width);
    }

    // Getters and Setters
    private void setLength(int length) {
        this.length = length;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    // Methods
    public int calculateArea() {
        return getLength() * getWidth();
    }
}
