package Problems;
import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> hshMap = new LinkedHashMap<>();

        for(int num: arr2) {
            hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num: arr1) {
            if(hshMap.containsKey(num)) {
                hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
            }
            else{
                minHeap.offer(num);
            }             
        }

        int[] ans = new int[arr1.length];
        int k = 0;
        for(var entry: hshMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            for(int i = 0;  i < value - 1;  i++) {
                ans[k++] = key;
            }
        }

        while(!minHeap.isEmpty()) {
            ans[k++] = minHeap.poll();
        }

        return ans;
    }
}
