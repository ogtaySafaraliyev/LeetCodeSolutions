package Problems;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
	// public int removeDuplicates(int[] nums) {
    //     Set<Integer> hshSet = new TreeSet<>();

    //     for(int num: nums) {
    //         hshSet.add(num);
    //     }

    //     Arrays.fill(nums, 0);
    //     int i = 0;
    //     for(int elmnt: hshSet) {
    //         nums[i++] = elmnt;
    //     }
    //     return i;        
    // }

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1;  i < nums.length;  i++) {
            if(nums[i-1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }                       
        return k;
    }
}
