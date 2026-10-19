package problems3;
import java.util.*;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int lessThanTarget = 0;
        int targetIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                lessThanTarget++;
            }
            else if(nums[i] == target) {                
                targetIndex++;
            }
        }
        for(int i = 0; i < targetIndex; i++) {
            list.add(lessThanTarget++);
        }
        return list;
    }

    // public List<Integer> targetIndices(int[] nums, int target) {
    //     List<Integer> list = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for(int i = 0; i < nums.length; i++) {
    //         if(target == nums[i]) {
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }
}
