package Problems;

public class XORQueriesOfASubarray {
    // public int[] xorQueries(int[] arr, int[][] queries) {

    //     int[] ans = new int[queries.length];

    //     for (int i = 0; i < queries.length; i++) {
    //         int left = queries[i][0];
    //         int right = queries[i][1];

    //         int element = 0;
    //         for (int j = left; j <= right; j++) {
    //             element ^= arr[j];
    //         }
    //         ans[i] = element;
    //     }

    //     return ans;

    // }

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor = new int[arr.length + 1];

        for(int i=1;  i <= arr.length;  i++) {
            prefixXor[i] = prefixXor[i-1] ^ arr[i-1];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            
            ans[i] = prefixXor[left] ^ prefixXor[right + 1];
        }

        return ans;
    }
}
