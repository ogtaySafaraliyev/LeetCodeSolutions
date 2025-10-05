package Problems;
import java.util.*;

public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hshMap1 = new HashMap<>();
        Map<Integer, Integer> hshMap2 = new HashMap<>();

        int[] ansArr = new int[2];

        for (int num : nums1) {
            hshMap1.put(num, hshMap1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            hshMap2.put(num, hshMap2.getOrDefault(num, 0) + 1);
        }

        int count1 = 0;
        for (var elmnt : hshMap2.entrySet()) {
            int key = elmnt.getKey();
            if (hshMap1.containsKey(key)) {
                count1 += elmnt.getValue();
            }
        }

        int count2 = 0;
        for (var elmnt : hshMap1.entrySet()) {
            int key = elmnt.getKey();
            if (hshMap2.containsKey(key)) {
                count2 += elmnt.getValue();
            }
        }

        ansArr[0] = count2;
        ansArr[1] = count1;

        return ansArr;
    }
}
