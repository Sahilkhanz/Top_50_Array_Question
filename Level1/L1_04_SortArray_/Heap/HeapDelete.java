public class HeapDelete {
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

    public static void buildHeap(int arr[],int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static int deleteHeap(int arr[],int n) {
        arr[0] = arr[n - 1];
        n--;
        heapify(arr, n, 0);
        return n;
    }
    
    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 2, 7, 9, 5 };
        int n = arr.length;
        System.out.println("Original Array " + n );
        for (int cell : arr) 
            System.out.print(cell + " ");
        buildHeap(arr, n);

        System.out.println("\nMax Heap " + n);
        for (int cell : arr) 
            System.out.print(cell + " ");
        int m = deleteHeap(arr, n);
        System.out.println("\nHeap after root Delete "+m);
        for (int i = 0; i < m;i++) 
            System.out.print(arr[i]+" ");
        
    }
}
