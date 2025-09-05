package Problems;
import java.util.*;

public class MergeTwo2DArraysBySummingValues {
	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> hshMap = new TreeMap<>();

        for (int[] innerArr : nums1) {
            int id = innerArr[0];
            int val = innerArr[1];

            hshMap.put(id, val);
        }

        for (int[] innerArr : nums2) {
            int id = innerArr[0];
            int val = innerArr[1];

            if (!hshMap.containsKey(id)) {
                hshMap.put(id, val);
            } else {
                hshMap.computeIfPresent(id, (k, v) -> v + val);
            }
        }

        int n = hshMap.size();
        int[][] ansArr = new int[n][2];
    
        int i = 0;
           
        for(var elmnt: hshMap.entrySet()) {
            ansArr[i][0] = elmnt.getKey();
            ansArr[i][1] = elmnt.getValue();
            i++;
        }
        return ansArr;
    }
}
