package problems3;

public class MinimumMovesToEqualArrayElementsIII {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        int minMoves = max * nums.length - sum;
        return minMoves;
    }
}
