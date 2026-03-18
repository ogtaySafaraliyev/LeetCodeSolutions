package Problems;
import java.util.*;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] sorted = new int[len];
        //copy array
        for(int i = 0;  i < len; i++) {
            sorted[i] = nums[i];
        }

        //sort the fucking array
        Arrays.sort(sorted);

        Map<Integer, Integer> hshMap = new HashMap<>();
        for(int i = 0;  i < len;  i++) {
            if(!hshMap.containsKey(sorted[i])) {
                hshMap.put(sorted[i], i);
            }
        } 

        int[] result = new int[len];
        for(int i = 0; i < len;  i++) {
            result[i] = hshMap.get(nums[i]);
        }
        return result;
    }
}
