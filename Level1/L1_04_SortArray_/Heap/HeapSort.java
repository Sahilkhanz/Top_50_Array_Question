public class HeapSort {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 9, 6, 8 };
        int n = arr.length;
        heapSort(arr);
        for (int cell : arr)
            System.out.print(cell + " ");
    }
    
    public static void heapSort(int arr[]) {
        int n = arr.length;

        //construction of max heap
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // deletion of the root
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int L = 2 * i + 1;
        int R = 2 * i + 2;

        if(L<n&&arr[L]>arr[largest])
            largest = L;
        if (R < n && arr[R] > arr[largest]) 
            largest = R;
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
        
    }
}
