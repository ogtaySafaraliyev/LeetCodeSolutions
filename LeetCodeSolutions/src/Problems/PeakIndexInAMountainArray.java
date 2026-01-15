package Problems;
import java.util.*;

public class PeakIndexInAMountainArray {
	public int peakIndexInMountainArray(int[] arr) {
        Map<Integer, Integer> hshMap = new HashMap<>();

        for(int i = 0;  i < arr.length;  i++) {
            hshMap.put(i, arr[i]);
        }

        Arrays.sort(arr);

        int wantedNum = arr[arr.length - 1];
        
        for(var entry: hshMap.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();

            if(value == wantedNum) {
                return key;
            }
        }
        return 0;
    }
}
