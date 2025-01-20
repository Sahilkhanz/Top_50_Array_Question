
// Input matrix :          0 1 1 1
//                         0 0 0 0
//                         0 0 1 1
//                         1 1 1 1 
// Output: 2
// Explanation: Row = 2 has maximum number of 1s, that is 4.
// Input matrix :          0 0 1 1
//                         0 1 1 1
//                         0 0 1 1  
//                         0 0 0 0
// Output: 1
// Explanation: Row = 1 has maximum number of 1s, that is 3.
public class L1_09_FindRowWithMaximumOnes {

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 0, 1, 1}
        };

        findMax1s(arr);

    }

    public static void findMax1s(int arr[][]) {
        int count = 0;
        int max = 0;
        int row = 0;
        for (int i = row; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (max < count) {
                max = count;
                row = i;
            }
            count = 0;

        }
        System.out.println("row :" + row);

    }
}
