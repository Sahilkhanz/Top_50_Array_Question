//   Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
// Output : 1
// Explanation: Note that 1 appear 4 times which is more than  7 / 2 times 

// Input : arr[] = {3, 3, 4, 2, 4, 4, 2, 4}
// Output :  -1 
// Explanation: There is no element whose frequency is greater than the half of the size of the array size.
// Input : arr[] = {3}
// Output : 3
// Explanation: Appears more than n/2 times
// [Naive Approach] Using Two Nested Loops – O(n^2) Time and O(1) Space
// [Better Approach] Using Sorting – O(n log n) Time and O(1) Space
// [Optimal Approach] Using Hashing – O(n) Time and O(n) Space
// [Expected Approach] Using Moore’s Voting Algorithm- O(n) Time and O(1) Space
public class L1_10_MajorityElement {

    public static int majorityElement(int arr[]) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2};
        System.out.println(majorityElement(arr));
    }

}
