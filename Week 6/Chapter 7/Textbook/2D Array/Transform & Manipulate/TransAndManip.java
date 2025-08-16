public class TransAndManip {
    public static void main(String[] args) {
        int[][] squareArray = { {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9} };

        displayArray(squareArray);
        rotateArray();
        displayArray(squareArray);

    }

    public static int[][] rotateArray(/* square (N * N) int[][] */) {
        // Rotate square 90 degrees clockwise
    }

    /**
     * Prints the square array in a (N * N) square shape in the terminal
     * @param array N * N square 2D array
     */
    public static void displayArray(int[][] array) {
        System.out.println();
        for (int row = 0; row < array.length; row++) {
            for (int value : array[row])
                System.out.print(value + " ");
            System.out.println();
        }
        System.out.println();
    }
}
