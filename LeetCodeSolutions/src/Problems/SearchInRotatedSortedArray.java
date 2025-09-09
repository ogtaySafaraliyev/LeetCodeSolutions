package Problems;
import java.util.*;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> hshMap = new TreeMap<>();

        for(int i = 0; i < nums.length;  i++) {
            hshMap.put(nums[i], i);
        }

        if(hshMap.containsKey(target)) {
            return hshMap.get(target);
        } 
        return -1;
    }

    // check more efficeient method later
}
