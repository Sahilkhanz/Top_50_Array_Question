public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 5, 1, 9, 4, 6, 3, 2 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;

    }
}