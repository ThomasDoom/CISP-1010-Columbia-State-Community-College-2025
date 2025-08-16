public class ArrayOperations2D {
    // Fields
    private int[][] array;

    // Constructors
    public ArrayOperations2D() {
        setArray(new int[2][2]);
    }

    public ArrayOperations2D(int[][] array) {
        setArray(array);
    }

    // Getters
    public int[][] getArray() { return array; }

    // Setters
    public void setArray(int[][] array) { this.array = array; }

    // Methods (Operations)

    /**
     * Calculate the added total of a 2D array
     * @return The Added total
     */
    public int getTotal() {
        int total = 0;
        for (int[] row : array){
            for (int value : row)
                total += value;
        }
        return total;
    }

    /**
     * Calculate the average of all array values
     * @return The Average
     */
    public int getAverage() {
        return getTotal() / getArraySize();
    }

    /**
     * Calculte the added total of a specified row in a 2D array
     * @param rowIndex The focus row to calculate the total of
     * @return The added total
     */
    public int getRowTotal(int rowIndex) {
        int total = 0;
        for (int value : array[rowIndex])
            total += value;
        return total;
    }

    /**
     * Calculate the added total of a specified column in a 2D array
     * @param columnIndex The focus column to calculate the total of
     * @return The added total
     */
    public int getColumnTotal(int columnIndex) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            if (columnIndex < array[row].length)
                total += array[row][columnIndex];
        }
        return total;
    }

    /**
     * Compare through a row of a 2D array to find it's max value
     * @param rowIndex The focus row of the values being compared
     * @return The row's max value
     */
    public int getHighestInRow(int rowIndex) {
        int rowMax = this.array[rowIndex][0];  // Initialize a max
        for (int value : array[rowIndex]) {
            if (value > rowMax)
                rowMax = value;
        }
        return rowMax;
    }

    /**
     * Compare through a row of a 2D array to find it's min value
     * @param rowIndex The focus row of the values being compared
     * @return The row's min value
     */
    public int getLowestInRow(int rowIndex) {
        int rowMin = array[rowIndex][0];  // Initialize a min
        for (int value : array[rowIndex]) {
            if (value < rowMin)
                rowMin = value;
        }
        return rowMin;
    }

    // Methods (Helpers)

    /**
     * Counts the arrays total size
     * @return The size of the array
     */
    public int getArraySize() {
        int count = 0;
        for (int[] row : array)
            count += row.length;
        return count;
    }
}