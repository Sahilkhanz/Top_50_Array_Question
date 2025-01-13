public class L1_04_SortArray_BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 7, 9, 2, 5, 1, 4, 8, 3, 6 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }
}

/*
 * Steps of Bubble Sort:
 * Start at the beginning of the list.
 * Compare the first two elements:
 * If the first element is greater than the second, swap them.
 * If not, leave them as is.
 * Move to the next pair of elements (2nd and 3rd), and repeat the comparison
 * and swap if necessary.
 * Continue this process for each adjacent pair in the list.
 * Once you reach the end of the list, the largest element will "bubble up" to
 * its correct position (the end of the list).
 * Repeat the process for the remaining unsorted part of the list (ignoring the
 * last sorted elements).
 * Continue until no swaps are needed, meaning the list is fully sorted.
 */