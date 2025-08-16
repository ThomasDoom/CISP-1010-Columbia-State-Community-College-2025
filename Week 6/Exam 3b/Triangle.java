/**
 * Triangle class
 * July 1st, 2025
 * Mac Doom
 * Exam 3b
 */

public class Triangle {
    // Fields
    private double side1, // Base
                   side2, // Height
                   side3;

    // Constructors

    /**
     * Constructor
     *
     * @param s1 is The length of the side 1 of the Triangle.
     * @param s2 is The length of the side 2 of the Triangle.
     * @param s3 is The length of the side 3 of the Triangle.
     */
    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    // Setters

    /**
     * The setSide1 method stores a value in the
     * side1 field.
     *
     * @param s1 is The value to store in side1.
     */
    public void setSide1(double s1) {
        this.side1 = s1;
    }

    /**
     * The setSide2 method stores a value in the
     * side2 field.
     *
     * @param s2 is The value to store in side2.
     */
    public void setSide2(double s2) {
        this.side2 = s2;
    }


    /**
     * The setSide3 method stores a value in the
     * side1 field.
     *
     * @param s3 is The value to store in side3.
     */
    public void setSide3(double s3) {
        this.side3 = s3;
    }

    // Getters

    /**
     * The getSide1 method returns a Triangle
     * object's Side 1 length.
     *
     * @return The value in the Side1 field.
     */
    public double getSide1() {
        return this.side1;
    }

    /**
     * The getSide2 method returns a Triangle
     * object's Side 2 length.
     *
     * @return The value in the Side2 field.
     */
    public double getSide2() {
        return this.side2;
    }

    /**
     * The getSide3 method returns a Triangle
     * object's Side 3 length.
     *
     * @return The value in the Side3 field.
     */
    public double getSide3() {
        return this.side3;
    }

    // Methods

    /**
     * The calcArea method returns a Triangle object's area.
     *
     * @return The area of the Triangle assuming side1 as the base and side2 as the
     *         height .
     */
    public double calcArea() {
        return getSide1() * getSide2() / 2.0;
    }
}
