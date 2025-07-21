package Problems;
import java.util.*;

public class FindPeakElement {
	// public int findPeakElement(int[] nums) {
    //     HashMap<Integer, Integer> hshMap = new HashMap<>();
    //     for(int i = 0; i < nums.length; i++) {
    //         hshMap.put(nums[i], i);
    //     }
    //     Arrays.sort(nums);
    //     return hshMap.get(nums[nums.length - 1]);
    // }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + ((right - left) >> 1);

            if(nums[mid] > nums[mid + 1]) {
                right = mid;
            }
            else if(nums[mid] <= nums[mid + 1]) {
                left = mid + 1;
            } 
        }
        return left; 
    }
}
