package Problems;
import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        int[] result = new int[arr.length];
        int index = 0;
        
        for (Map.Entry<Integer, Integer> entry : list) {
            int element = entry.getKey();
            int frequency = entry.getValue();
                        
            for (int i = 0; i < frequency; i++) {
                result[index++] = element;
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;  i < result.length - k;  i++) {
            set.add(result[i]);
        }

        return set.size();
    }
}
