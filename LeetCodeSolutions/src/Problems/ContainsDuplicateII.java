package Problems;
import java.util.*;

public class ContainsDuplicateII {
	class Solution {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        Map<Integer, Integer> hshMap = new HashMap<>();

	        for(int i = 0; i < nums.length; i++) {
	            if(hshMap.containsKey(nums[i])) {
	                int prevIndex = hshMap.get(nums[i]); 
	                if(i - prevIndex <= k) {
	                    return true;
	                }
	            }
	            hshMap.put(nums[i], i);
	        }
	        return false;
	    }
	}
}
