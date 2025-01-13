public class L1_05_FindDuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 };
        int n = arr.length;
        int duplicate[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            boolean isduplicate = false;

            for (int y = 0; y < k; y++) {
                if (duplicate[y] == element) {
                    isduplicate = true;
                    break;
                }
            }

            if (!isduplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == element) {
                        duplicate[k] = arr[j];
                        k++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(duplicate[i]+" ");
        }
    }
}