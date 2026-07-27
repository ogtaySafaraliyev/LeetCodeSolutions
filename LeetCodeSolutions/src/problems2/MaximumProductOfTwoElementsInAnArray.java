package problems2;
import java.util.*;

public class MaximumProductOfTwoElementsInAnArray {
    // public int maxProduct(int[] nums) {
    //     Arrays.sort(nums);

    //     int max1 = nums[nums.length - 1] - 1;
    //     int max2 = nums[nums.length  - 2] - 1;
    //     return max1 * max2;
    // }

    // public int maxProduct(int[] nums) {
    //     int ans = 1;
    //     PriorityQueue<Integer> priorQue = new PriorityQueue<>(Collections.reverseOrder());

    //     for(int num: nums) {
    //         priorQue.offer(num);
    //     }

    //     for(int i = 0; i < 2; i++) {
    //         int max = priorQue.poll() - 1;
    //         ans *= max;
    //     }
    //     return ans;
    // }

    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(max1 < nums[i]) {
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
