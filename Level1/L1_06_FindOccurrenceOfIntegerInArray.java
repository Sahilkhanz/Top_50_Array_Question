public class L1_06_FindOccurrenceOfIntegerInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
        int n = arr.length;
        int occurrence[] = new int[n*2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int count = 0;
            boolean isAlreadyDuplicate = false;

            for (int l = 0; l < k; l++) {
                if (occurrence[l] == element) {
                    isAlreadyDuplicate = true;
                    break;
                }
            }

            if (!isAlreadyDuplicate) {
                for (int j = i; j < n; j++) {
                    if (arr[j] == element) {
                        occurrence[k] = arr[i];
                        count++;
                    }
                }
                
                occurrence[k] = element;
                occurrence[k + 1] = count;
                k = k + 2;
            }
        }

        for (int i = 0; i < k; i=i+2) {
            System.out.print(occurrence[i]+" -> " + occurrence[i+1]+"\n");
        }
    }
}
// Input : arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
// Output : 10 3
// 20 4
// 5 1

// Input : arr[] = {10, 20, 20}
// 20 2
// Output : 10 1

// public class CountFrequencies {
//     public static void main(String[] args) {
//         int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 }; // Input array

//         int n = arr.length;

//         // Loop through each element of the array
//         for (int i = 0; i < n; i++) {
//             // Skip this element if it's already been counted
//             boolean alreadyCounted = false;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     alreadyCounted = true;
//                     break;
//                 }
//             }

//             // If the element is not counted, count its frequency
//             if (!alreadyCounted) {
//                 int count = 0;
//                 for (int j = 0; j < n; j++) {
//                     if (arr[i] == arr[j]) {
//                         count++;
//                     }
//                 }

//                 // Print the element and its frequency
//                 System.out.println(arr[i] + " " + count);
//             }
//         }
//     }
// }
