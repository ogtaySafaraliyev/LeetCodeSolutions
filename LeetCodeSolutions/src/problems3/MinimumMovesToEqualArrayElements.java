package problems3;

public class MinimumMovesToEqualArrayElements {
	public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        int minMoves = sum - min * nums.length;
        return minMoves;
    }
}
