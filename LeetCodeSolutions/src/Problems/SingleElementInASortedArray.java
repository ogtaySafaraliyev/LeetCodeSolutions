package Problems;
import java.util.*;

public class SingleElementInASortedArray {
    // public int singleNonDuplicate(int[] nums) {
    //     HashMap<Integer, Integer> freq = new HashMap<>();
    //     for(int num: nums) {
    //         freq.put(num, freq.getOrDefault(num, 0) + 1);
    //     }

    //     int ans = 0;

    //     for(var entry: freq.entrySet()) {
    //         if(entry.getValue() == 1) {
    //             ans = entry.getKey();
    //             break;
    //         }
    //     }
    //     return ans;
    // }

    // public int singleNonDuplicate(int[] nums) {
    //     Set<Integer> set = new HashSet<>();
        
    //     for(int num: nums) {            
    //         if(set.contains(num)) {
    //             set.remove(num);
    //         }
    //         else {
    //             set.add(num);
    //         }                       
    //     }
    //     return set.iterator().next();            
    // }

    // public int singleNonDuplicate(int[] nums) {
    //     int ans = 0;
    //     for(int num: nums) {
    //         ans ^= num;
    //     }
    //     return ans;
    // }

    // yooo solve it with binary search method later

}
