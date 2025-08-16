public class RectangleTest {
    public static void main(String[] args) {
        // Test Fields and Calculation Methods
        Rectangle r1 = new Rectangle(5, 3);
        toString(r1);
        Rectangle r2 = new Rectangle(4, 4);
        toString(r2);
        Rectangle r3 = new Rectangle(5, 3);
        toString(r3);

        // Test Comparison Methods
        System.out.println();
        System.out.printf("Rectangle 1 equals Rectangle 3: %B%n", r1.equals(r3));
        System.out.printf("Rectangle 2 is larger than Rectangle 1: %B%n", r2.isLargerThan(r1));
        System.out.printf("Rectangle 2 is a square: %B%n", r2.isSquare());

        // Test Scaling
        System.out.println();
        System.out.println("After scaling Rectangle 1 by 2.0:");
        r1.scaleBy(2);
        toString(r1);

    }

    public static void toString(Rectangle r) {
        System.out.printf("Rectangle 1: %.1f x %.1f (Area: %.1f, Perimeter: %.1f)",
                           r.getLength(), r.getWidth(), r.calculateArea(), r.calculatePerimeter());
        if (r.isSquare())
            System.out.print(" - Square");
        System.out.println();
    }
}
