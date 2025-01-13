/*
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9
Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
Maximum element is: 35
*/
public class L1_01_FindMinimumMaximumElementInArray {
    public static void main(String args[]) {
        int arr[] = { 22, 14, 84, 17, 35, 343 };
        int min=arr[0],max=arr[0];

        for (int i = 1; i < arr.length;i++) {
            if (arr[i]< min) {
                min = arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        
        System.out.println("Minimum Element is: "+min);
        System.out.println("Maximum Element is: "+max);
    }
}