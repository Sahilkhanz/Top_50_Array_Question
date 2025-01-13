/*
 * Input: arr[] = [1, 2, 3, 4, 5]
 * Output: [5, 1, 2, 3, 4]
 * 
 * 
 * Input: arr[] = [2, 3, 4, 5, 1]
 * Output: [1, 2, 3, 4, 5]
 */
public class L1_03_CyclicallyRotateArrayByOne {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int high = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = high;

        //traverse
        for (int cell : arr) {
            System.out.print(cell+" ");
        }
    }
}