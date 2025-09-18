package Problems;

public class FindMinimumInRotatedSortedArray {
    // public int findMin(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[0];        
    // }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        if(nums[left] < nums[right]) {
            return nums[left];
        }       

        while(left < right) {
            if(nums[mid] >= nums[0]) {
                left = mid + 1;
            }

            else {
                right = mid;
            }
            
            mid = (left + right) / 2;
        }

        return nums[left];
    }
}
