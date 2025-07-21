package Problems;
import java.util.*;

public class CountCompleteSubarraysInAnArray {
	public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hshSet = new HashSet<>();
        for(int num: nums) {
            hshSet.add(num);
        }

        int uniqueCount = hshSet.size();
        int ans = 0;
        int len = nums.length;

        HashMap<Integer, Integer> hshMap = new HashMap<>();
        int left = 0;
        int right = 0; 
        while(right < len) {
            hshMap.put(nums[right], hshMap.getOrDefault(nums[right], 0) + 1);
            
            while(uniqueCount == hshMap.size()) {
                ans += len - right;
                hshMap.put(nums[left], hshMap.getOrDefault(nums[left], 0) - 1);
                if(hshMap.get(nums[left]) == 0) {
                    hshMap.remove(nums[left]);
                }
                left++;
            }
            right++;           
            
        }
        return ans;

    }
}
