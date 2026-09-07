package problems3;

public class SmallestStableIndexI {
	public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] maxArr = new int[len];
        int[] minArr = new int[len];

        for(int i = 0; i < len; i++) {
            max = Math.max(nums[i], max);            
            maxArr[i] = max;
        }

        for(int i = len - 1; i >= 0; i--) {
            min = Math.min(nums[i], min);
            minArr[i] = min;
        }

        for(int i = 0; i < len; i++) {
            int num = maxArr[i] - minArr[i];
            if(num <= k) {
                return i;
            }
        }
        return -1;
    }
}
