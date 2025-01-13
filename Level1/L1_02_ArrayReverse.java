/*
Input:arr[]={1,4,3,2,6,5}
Output:{5,6,2,3,4,1}
Explanation:The first element 1 moves to last position,the second element 4 moves to second-last and so on.
Input:arr[]={4,5,1,2}
Output:{2,1,5,4}
Explanation:The first element 4 moves to last position,the second element 5 moves to second last and so on.
*/

public class L1_02_ArrayReverse {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Array : ");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
