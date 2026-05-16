package problems2;

public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // minimum is on the right side
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                
                right = mid;
            } else {
                // duplicates -> cannot decide
                right--;
            }
        }

        return nums[left];
    }
}
