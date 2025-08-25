package Problems;
import java.util.*;

public class SingleNumberII {
    // public int singleNumber(int[] nums) {
    //     Map<Integer, Integer> freqMap = new HashMap<>();

    //     for(int num: nums) {
    //         freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    //     }

    //     int ans = 0;
    //     for(var elmnt: freqMap.entrySet()) {
    //         int count = elmnt.getValue();
    //         if(count == 1) {
    //             ans = elmnt.getKey();
    //         }
    //     }

    //     return ans;
    // }

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for(int num: nums) {
            ones = (num ^ ones) & ~twos;
            twos = (num ^ twos) & ~ones;
        }
        return ones;
    }
}
