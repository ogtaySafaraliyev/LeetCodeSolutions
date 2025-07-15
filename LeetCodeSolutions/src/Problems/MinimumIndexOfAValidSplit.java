package Problems;
import java.util.*;

public class MinimumIndexOfAValidSplit {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        int mostFreq = 0;
        int mostFreqNum = 0;

        for(int num: nums) {
            hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
            mostFreq = Math.max(hshMap.get(num), mostFreq);
        }
        for (Map.Entry<Integer, Integer> entry : hshMap.entrySet()) {
            if (entry.getValue().equals(mostFreq)) {
                mostFreqNum = entry.getKey();                
            }
        }

        int currentCount = 0;
        for(int i=1;  i <= nums.size();  i++) {
            if(nums.get(i-1) == mostFreqNum) {
                currentCount++;

                if(currentCount * 2 > i && (mostFreq - currentCount) * 2 > (nums.size() - i)) {
                    return i - 1;
                }
            }

        }
        return -1;
    }
}
