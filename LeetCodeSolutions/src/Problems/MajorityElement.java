package Problems;
import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hshMap = new HashMap<>();

        for(int num: nums) {
            hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> entry: hshMap.entrySet()) {
            int count = entry.getValue();
            max = Math.max(max, count);
        }

        int ans = 0;
        for(var entry: hshMap.entrySet()) {
            if(entry.getValue() == max) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}
