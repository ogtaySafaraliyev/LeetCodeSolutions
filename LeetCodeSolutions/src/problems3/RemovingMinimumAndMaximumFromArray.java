package problems3;

public class RemovingMinimumAndMaximumFromArray {
	public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
            if(nums[i] < nums[minIndex]) {
                minIndex = i;
            }            
        }

        int low = Math.min(minIndex, maxIndex);
        int high = Math.max(minIndex, maxIndex);

        int removeFromFront = high + 1;
        int removeFromBack = len - low;
        int removeFromBothSides = (low + 1) +(len - high);

        return Math.min(removeFromFront, Math.min(removeFromBothSides, removeFromBack));
    }
}
