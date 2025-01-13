public class L1_04_SortArray_SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 1, 7, 8, 9, 2, 4 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = arr[i],index=i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }    
}
