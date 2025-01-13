public class HeapDeletion {
    public static void main(String[] args) {
        int arr[] = { 50, 30, 40, 10, 5, 20, 30};
        buildHeap(arr);
        for (int cell : arr)
            System.out.print(cell + " ");
        deleteHeap(arr);
        System.out.println();
    }

    public static void buildHeap(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void deleteHeap(int arr[]) {
        // deletion of the root means arr[0]
        int n = arr.length;
        arr[0] = arr[n-1];
        n--;
        heapify(arr, n, 0);
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int L = 2 * i + 1;
        int R = 2 * i + 2;

        if (L < n && arr[L] > arr[largest])
            largest = L;
        if (R < n && arr[R] > arr[largest])
            largest = R;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
