package Problems;
import java.util.*;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
	public int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> hshMap = new HashMap<>();
		for (int num : nums) {
			hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
		}
		int count = 0;
		for (var entry : hshMap.entrySet()) {
			int key = entry.getKey();
			if (hshMap.containsKey(key + k)) {
				count += entry.getValue() * hshMap.get(k + key);
			}
		}
		return count;
	}
}
