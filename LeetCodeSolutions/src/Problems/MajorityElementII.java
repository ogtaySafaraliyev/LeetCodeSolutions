package Problems;
import java.util.*;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Integer neededCount = nums.length / 3;
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(var entry: freq.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            
            if(value > neededCount) {
                list.add(key);
            }
        }
        return list;
    }
}
