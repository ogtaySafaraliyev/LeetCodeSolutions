package problems3;

public class SmallestStableIndexII {
	public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] minArr = new int[len];
        int[] maxArr = new int[len];

        for(int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
            max = Math.max(nums[i], max);
            maxArr[i] = max;

            min = Math.min(nums[j], min);
            minArr[j] = min;
        }
        
        for(int i = 0; i < len; i++) {
            int diff = maxArr[i] - minArr[i];
            if(diff <= k) {
                return i;
            }
        }
        return -1;
    }
}
