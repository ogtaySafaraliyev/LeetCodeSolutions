package problems3;
import java.util.*;

public class MaximumAlternatingSumOfSquares {
	public long maxAlternatingSum(int[] nums) {
        long firstHalfSum = 0L;
        long secondHalfSum = 0L;
        
        long[] arr = new long[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = (long) (nums[i] * nums[i]);
        }

        Arrays.sort(arr);

        for(int i = 0; i < nums.length/2; i++) {
            firstHalfSum += arr[i];
        }

        for(int i = nums.length / 2; i < nums.length; i++) {
            secondHalfSum += arr[i];
        }

        return secondHalfSum - firstHalfSum;
    }
}
