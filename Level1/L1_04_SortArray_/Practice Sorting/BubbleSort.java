public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 7, 5, 9, 8, 3, 2, 5, 1, 4, 6 };
        int n = arr.length;

        bubbleSort(arr, n);
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }

    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
