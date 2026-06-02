package problems2;
import java.util.*;

public class MakeArrayZeroBySubtractingEqualAmounts {
    // public int minimumOperations(int[] nums) {
    //     Set<Integer> set = new HashSet<>();

    //     for(int num: nums) {
    //         if(num != 0) {
    //             set.add(num);
    //         }
    //     }
    //     return set.size();
    // }

    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        int count = 0;

        for(int num: nums) {
            if(num != 0 && num != prev) {
                count++;
                prev = num;
            }
        }
        return count;
    }
}
