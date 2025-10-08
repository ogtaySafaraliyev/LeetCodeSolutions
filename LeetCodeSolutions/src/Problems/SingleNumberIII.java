package Problems;
import java.util.*;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] ans = new int[2];

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int i = 0;
        for(var elmnt: freq.entrySet()) {
            if(elmnt.getValue() == 1) {
                int key = elmnt.getKey();
                ans[i] = key;
                i++;
            }
        }
        return ans;
    }
}
