package Problems;

public class SumOfAbsoluteDifferencesInASortedArray {
	public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefixSum = new int[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Compute result
        for (int i = 0; i < n; i++) {
            int left = (i * nums[i]) - prefixSum[i];
            int right = (prefixSum[n] - prefixSum[i + 1]) - ((n - i - 1) * nums[i]);
            ans[i] = left + right;
        }

        return ans;
    }
}
