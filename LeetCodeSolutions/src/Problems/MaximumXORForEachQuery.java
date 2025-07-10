package Problems;

public class MaximumXORForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;

        int xorSum = 0;
        for(int num: nums) {
            xorSum ^= num;
        } 
        int mask = (1 << maximumBit) - 1;

        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            int maxXor = mask ^ xorSum;

            ans[i] = maxXor;

            int currentNum = nums[n - i - 1];
            xorSum ^= currentNum;  
        }
        return ans;
    }
}
