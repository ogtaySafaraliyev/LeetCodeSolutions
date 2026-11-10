package problems3;
import java.util.*;

public class RearrangeArrayByRemovingDistinctValues {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        int len = nums.length;
        int[] ans = new int[len];
        
        for(int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int index = 0;
        while(!map.isEmpty()) {
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            while(it.hasNext()) {
                var entry = it.next();
                ans[index++] = entry.getKey();         
                if (entry.getValue() == 1) {
                    it.remove();                 
                } else {
                    entry.setValue(entry.getValue() - 1);
                }
            }
        }
        return ans;
    }
}
