
// Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
// Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
// Input: arr[] = {20, 10, 8, 6, 4, 2}
// Output: arr[] = {20, 8, 10, 4, 6, 2}
public class L1_11_WaveArray {

    public static void waveArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i, i - 1);
            }
            if (arr[i + 1] > arr[i]) {
                swap(arr, i, i + 1);
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        waveArray(arr);
        for (int cell : arr) {
            System.out.print(cell + " ");
        }
    }
}
