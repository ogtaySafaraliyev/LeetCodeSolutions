package Problems;
import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int len = nums.length;

        int max = nums[len - 1];

        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for(int num: nums) {
            if(num > 0) {
                treeSet.add(num);
            }            
        }

        if(treeSet.isEmpty()) {
            return 1;
        }

        int i = 1;
        for(int num: treeSet) {
            if(num != i) {
                return i;
            }
            i++;
        }
        return max + 1;                
    }
}
