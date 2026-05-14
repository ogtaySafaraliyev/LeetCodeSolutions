package problems2;
import java.util.*;

public class FindTheKthSmallestSumOfAMatrixWithSortedRows {
    public int kthSmallest(int[][] mat, int k) {
        int[] rowSum = mat[0];

        for(int i = 1; i < mat.length; i++) {
            rowSum = kSmallestPairs(rowSum, mat[i], k);
        }

        return rowSum[Math.min(k, rowSum.length) - 1];
        
    }

    private int[] kSmallestPairs(int[] arr1, int[] arr2, int k) {

        PriorityQueue<int[]> prQue = new PriorityQueue<>((a,b) -> (a[0] - b[0]));

        for(int i = 0; i < Math.min(k, arr1.length); i++) {
            prQue.offer(new int[] {arr1[i] + arr2[0], i, 0}); 
        }

        int limit = Math.min(k, arr1.length * arr2.length);
        int[] res = new int[limit];

        for(int i = 0; i < limit; i++) {
            int[] current = prQue.poll();

            res[i] = current[0];

            int index1 = current[1];
            int index2 = current[2];

            if(index2 + 1 < arr2.length) {
                prQue.offer(new int[] {arr1[index1] + arr2[index2 + 1], index1, index2 + 1});
            }
        }
        return res;
    }
}
