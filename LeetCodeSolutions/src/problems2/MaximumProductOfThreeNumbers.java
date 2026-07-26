package problems2;
import java.util.*;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {        
        Arrays.sort(nums);
        int n = nums.length;

        int possibility1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int possibility2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(possibility1, possibility2);
    }
}
