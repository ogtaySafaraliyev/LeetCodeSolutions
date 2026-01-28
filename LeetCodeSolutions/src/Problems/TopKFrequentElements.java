package Problems;
import java.util.*;

public class TopKFrequentElements {
	class Solution {
	    public int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        for(int num: nums) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
	        list.sort((a, b) -> b.getValue() - a.getValue());

	        int[] arr = new int[k];
	        for(int i = 0; i < k; i++) {
	            Map.Entry<Integer, Integer> entry = list.get(i);
	            int number = entry.getKey();
	            arr[i] = number;
	        }
	        return arr;        
	    }
	}
}
