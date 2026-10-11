package problems3;

public class SumOfSquaresOfSpecialElements {
	public int sumOfSquares(int[] nums) {
        int len = nums.length;
        int ans = 0;

        for(int i = 0; i < len; i++) {
            if(len % (i + 1) == 0) {
                ans += nums[i] * nums[i];
            }            
        }
        return ans;
    }
}
