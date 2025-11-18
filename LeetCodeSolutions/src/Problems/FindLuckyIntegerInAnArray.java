package Problems;
import java.util.*;

public class FindLuckyIntegerInAnArray {
	public int findLucky(int[] arr) {     
        Map<Integer, Integer> hshMap = new HashMap<>(); 

        for(int num: arr) {
            hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for(var entry: hshMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(key == value) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        return ans;
    }    

    // public int findLucky(int[] arr) {
    //     int[] freq = new int[501];

    //     for(int i = 0; i < arr.length; i++) {
    //         freq[arr[i]]++;
    //     }

    //     int ans = -1;
    //     for(int i = 0; i < freq.length; i++) {
    //         if(i == freq[i]) {
    //             ans = Math.max(ans, i);
    //         }            
    //     }
    //     return ans != 0 ? ans : -1;
    // }
}
