package Problems;
import java.util.*;

public class ReductionOperationsToMakeTheArrayElementsEqual {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int distinctElmntCount = 0;

        for(int i = 1; i < nums.length;  i++) {
            if(nums[i] != nums[i-1]) {
                distinctElmntCount++;
            }
            count += distinctElmntCount;
        }
        return count;
    }
}
