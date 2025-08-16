import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9} };

        findExtrema(array);
    }
    public static void findExtrema(int[][] array) {

        /* ----
        *  ROWS
        ---- */

        int totalRows = array.length;

        int[] maxAlongRows = new int[totalRows];
        int[] minAlongRows  = new int[totalRows];
        // Find Min-Max
        for (int row = 0; row < totalRows; row++) {
            int max = array[row][0];
            int min = array[row][0];

            for (int value : array[row]) {
                if (value > max) max = value;
                if (value < min) min = value;
            }
            maxAlongRows[row] = max;
            minAlongRows[row] = min;
        }

        // Print
        System.out.print("The maximum values along the rows are [");
        for (int i = 0; i < maxAlongRows.length; i++) {
            System.out.print(maxAlongRows[i]);
            if (i != maxAlongRows.length - 1) System.out.print(",");
        }
        System.out.println("].");

        System.out.print("The minimum values along the rows are [");
        for (int i = 0; i < minAlongRows.length; i++) {
            System.out.print(minAlongRows[i]);
            if (i != minAlongRows.length - 1) System.out.print(",");
        }
        System.out.println("].");

        /* -------
        *  COLUMNS
        ------- */


        // Get Max Columns
        int maxColumns = 0;
        for (int[] row : array) {
            if (row.length > maxColumns)
                maxColumns = row.length;
        }

        int[] maxAlongColumns = new int[maxColumns];
        int[] minAlongColumns = new int[maxColumns];
        // Find Min-Max
        for (int col = 0; col < maxColumns; col++) {
            int max = array[0][col];
            int min = array[0][col];

            for (int row = 1; row < array.length; row++) {
                if (array[row][col] > max) max = array[row][col];
                if (array[row][col] < min) min = array[row][col];
            }
            maxAlongColumns[col] = max;
            minAlongColumns[col] = min;
        }

        // Print
        System.out.print("The maximum values along the columns are [");
        for (int i = 0; i < maxAlongColumns.length; i++) {
            System.out.print(maxAlongColumns[i]);
            if (i != maxAlongColumns.length - 1) System.out.print(",");
        }
        System.out.println("].");

        System.out.print("The minimum values along the columns are [");
        for (int i = 0; i < minAlongColumns.length; i++) {
            System.out.print(minAlongColumns[i]);
            if (i != minAlongColumns.length - 1) System.out.print(",");
        }
        System.out.println("].");
    }
}
