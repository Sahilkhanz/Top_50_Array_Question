public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 9, 3, 2, 5, 7, 1, 4 };
        int n = arr.length;
        selectionSort(arr, n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    index = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
