public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 7, 8, 9, 1, 4, 2 };
        int n = arr.length;

        insertionSort(arr, n);
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }

    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
