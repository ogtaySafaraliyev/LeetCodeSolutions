package problems2;
import java.util.*;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sortedArr = new int[n];

        for(int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }

        Arrays.sort(sortedArr);

        Map<Integer, Integer> hshMap = new HashMap<>();
        int rank = 0;
        for(int i = 0; i < n; i++) {
            if(!hshMap.containsKey(sortedArr[i])) {
                rank++;
                hshMap.put(sortedArr[i], rank);
            }            
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = hshMap.get(arr[i]);
        }
        return ans;
    }
}
