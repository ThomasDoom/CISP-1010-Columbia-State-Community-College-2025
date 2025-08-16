import java.util.Scanner;

/**
 * This program demonstrates the Triangle class's
 * constructor.
 *
 * With the assumption that base1 and base2 are the base and height of the triangle,
 * while also being a side length still, means the only type of triangle we are calculating
 * is a right triangle.
 *
 * July 1st, 2025
 * Mac Doom
 * Exam 3b
 */

public class TriangleDemo {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      // Variables for side measurements.
      double side1;
      double side2;
      double side3;

      System.out.println("\n╒═══ Area of a Right Triangle ═══╕\n");

      // Get Base
      System.out.print("  Enter Side 1: ");
      side1 = kb.nextDouble();

      // Get Height
      System.out.print("  Enter Side 2: ");
      side2 = kb.nextDouble();

      // Get Hypotenuse
      System.out.print("  Enter Side 3: ");
      side3 = kb.nextDouble();

      // Create a Triangle object to pass user input to the constructor.
      Triangle myTriangle = new Triangle(side1, side2, side3);

      // c = sqrt(a^2 + b^2)
      double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
      // Correct hypotenuse if invalid value inputted
      if (side3 != hypotenuse)
         correctHypotenuse(hypotenuse, myTriangle);

      // Display the lengths.
      System.out.println("\n  Side 1's length is " + myTriangle.getSide1());
      // Display the lengths.
      System.out.println("  Side 2's length is " + myTriangle.getSide2());
      // Display the lengths.
      System.out.printf ("  Side 3's length is %.1f%n%n", myTriangle.getSide3());
      // Display the area.
      System.out.println("  The triangle's area is " + myTriangle.calcArea());

      System.out.println("\n╘════════════════════════════════╛");
      System.out.println("\nThank you for this course! :)\n");
      kb.close();
   }

   /**
    * Corrects inputted hypotenuse value to make a valid triangle
    *
    * https://en.wikipedia.org/wiki/Pythagorean_triple
    *
    * @param hypotenuse
    * @param tri
    */
   public static void correctHypotenuse(double hypotenuse, Triangle tri) {
      System.out.println();
      System.out.println("    \033[1;38;5;196mSide 3 input does not create a right triangle ...");
      System.out.println("    Readjusting side 3 value to fit ...\033[0m");
      tri.setSide3(hypotenuse);
      System.out.printf ("    \033[1;38;5;231mSide 3 Adjusted to: \033[38;5;48m%.1f%n\033[0m", tri.getSide3());
   }
}
