package Problems;

public class SumOfAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        int totalSubset = 1 << n;

        for(int mask = 0; mask < totalSubset;  mask++) {
            int innerXOR = 0;
            for(int i = 0; i < n; i++) {
                if((mask & (1 << i)) != 0) {
                    innerXOR ^= nums[i];
                }
            }
            totalSum += innerXOR;
        }
        return totalSum;
    }
}
