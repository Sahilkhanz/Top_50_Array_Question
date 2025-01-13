public class L1_07_SortArrayOf0s1sAnd2s {
    public static void dutchNationalFlag(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 2,2,2,2,2,0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        System.out.println("Orinal Array: ");
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
        dutchNationalFlag(arr, n);
        System.out.println("\nSorted  Array:");
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }
}