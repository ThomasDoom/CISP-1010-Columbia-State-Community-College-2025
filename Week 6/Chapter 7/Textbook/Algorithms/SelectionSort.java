public class SelectionSort {
    public static void main(String[] args) {

        int[] array = { 5, 7, 2, 8, 9, 1 };

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            int temp = array [i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
