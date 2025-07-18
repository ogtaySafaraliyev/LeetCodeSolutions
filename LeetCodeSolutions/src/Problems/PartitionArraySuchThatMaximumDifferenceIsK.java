package Problems;
import java.util.*;

public class PartitionArraySuchThatMaximumDifferenceIsK {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        int count = 0;;

        while(i < n) {
            int start = nums[i];
            count++;
            while(i < n && nums[i] - start <= k) {
                i++;
            }
        }

        return count;
    }
}
