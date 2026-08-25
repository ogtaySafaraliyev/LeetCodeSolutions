package problems3;
import java.util.*;

public class SmallestMissingMultipleOfK {
	public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }

        int i = 1;
        while(true) {            
            int num = i * k;
            if(!set.contains(num)) {
                return num;
            }
            i++;
        }
    }
}
