package problems3;
import java.util.*;

public class CountElementsWithMaximumFrequency {
	public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;

        for(var entry: freq.entrySet()) {
            maxFreq = Math.max(maxFreq, entry.getValue());
        }

        int ans = 0;

        for(var entry: freq.entrySet()) {
            if(entry.getValue() == maxFreq) {
                ans += maxFreq;
            }
        }
        return ans;
    }
}
