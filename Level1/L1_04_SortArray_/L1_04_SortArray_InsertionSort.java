public class L1_04_SortArray_InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 2, 5, 1, 4, 8, 3, 6 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>num){
                arr[j + 1] = arr[j];
                j--;
                }

                arr[j+1] = num;
            }
            // if(index>0)
            for (int cell : arr) {
                System.out.print(cell + " ");
            }
        
    }
}
