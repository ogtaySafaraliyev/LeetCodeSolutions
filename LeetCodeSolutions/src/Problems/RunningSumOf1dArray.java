package Problems;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int current = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length;  i++) {
            current += nums[i];
            ans[i] = current;
        }
        return ans;
    }
}
