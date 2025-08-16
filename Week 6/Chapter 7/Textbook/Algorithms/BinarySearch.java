public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 8, 9, 1 };

        int value = 7;

        int first = 0;
        int last = arr.length - 1;
        int middle;
        int position = -1;
        boolean found = false;

        while (!found && first <= last) {
            middle = (first + last) / 2;

            if (arr[middle] == value) {
                found = true;
                position = middle;
            } else if (arr[middle] > value)
                last = middle - 1;
            else
                first = middle + 1;
        }

        System.out.println(position);
    }
}
