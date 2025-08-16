public class ArrayTest {
    public static void main(String[] args) {
        ArrayOperations2D ops = new ArrayOperations2D();
        // KNOWN ERRORS:
        // - Default constructor cant be int[0][0] (empty array)
        // - Jagged columns cand be accessed
        // - Low average precision
        // POTENTIAL ERRORS:
        // - Negative numbers not supported?


        /* -----------
        * Array 3 Test
        ----------- */
        System.out.println("\nDEFAULT CONSTRUCTOR");
        testMethods(ops, ops.getArray());

        /* -----------
        * Array 2 Test
        ----------- */
        int[][] array = { {1, 2, 3,},
                          {4, 5, 6},
                          {7, 8, 9} };

        System.out.println("\nARRAY 1");
        ops.setArray(array);
        testMethods(ops, array);


        /* -----------
        * Array 3 Test
        ----------- */
        int[][] array1 = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12} };

        System.out.println("\nARRAY 2");
        ops.setArray(array1);
        testMethods(ops, array1);


        /* -----------
        * Array 4 Test
        ----------- */
        int[][] array2 = { {10, 20},
                           {30, 40, 50}, // column 3 won't be read in columnTotal
                           {60} };

        ops.setArray(array2);
        System.out.println("\nARRAY 3");
        testMethods(ops, array2);
    }

    /**
     * Displays the results of every method for the full array
     * @param ops The Array Class object
     * @param array The array being tested
     */
    public static void testMethods(ArrayOperations2D ops, int[][] array) {
        // Display array
        System.out.println();
        for (int[] row : array) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }

        // Calculation Methods
        System.out.println("\n┌──── Test Methods ────┐");
        System.out.println("  Total: " + ops.getTotal());
        System.out.println("  Average: " + ops.getAverage());
        System.out.println("  Array size: " + ops.getArraySize());
        System.out.println("├──────────────────────┤");

        // Row method
        System.out.println("  Row totals:");

        for (int row = 0; row < array.length; row++)
            System.out.println("    Row " + row + ": " + ops.getRowTotal(row));

        System.out.println("├──────────────────────┤");

        // Column method
        System.out.println("  Column totals:");

        for (int col = 0; col < array[0].length; col++)
            System.out.println("    Column " + col + ": " + ops.getColumnTotal(col));

        System.out.println("├──────────────────────┤");

        // Row max
        System.out.println("  Highest in each row:");

        for (int row = 0; row < array.length; row++)
            System.out.println("    Row " + row + ": " + ops.getHighestInRow(row));

        System.out.println("├──────────────────────┤");

        // Row min
        System.out.println("  Lowest in each row:");

        for (int row = 0; row < array.length; row++)
            System.out.println("    Row " + row + ": " + ops.getLowestInRow(row));

        System.out.println("└──────────────────────┘\n");
    }

}