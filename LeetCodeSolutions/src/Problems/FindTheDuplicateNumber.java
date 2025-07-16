package Problems;
import java.util.*;

public class FindTheDuplicateNumber {
    // public int findDuplicate(int[] nums) {
    //     HashMap<Integer, Integer> hshMap = new HashMap<>();

    //     for(int num: nums) {
    //         hshMap.put(num, hshMap.getOrDefault(num, 0) + 1);
    //     }

    //     int ans = 0;
    //     int neededValue = 0;
    //     for(var value: hshMap.values()) {
    //         if(value >= 2) {
    //             neededValue = value;
    //         }
    //     }

    //     for (Map.Entry<Integer, Integer> entry : hshMap.entrySet()) {
    //         if (entry.getValue().equals(neededValue)) {
    //             ans = entry.getKey();
                
    //         }
    //     }
    //     return ans;
    // }

    // public int findDuplicate(int[] nums) { 
    //     HashSet<Integer> hshSet= new HashSet<>();
    //     int ans = 0;
    //     for(int num: nums) {
    //         if(hshSet.contains(num)) {
    //             ans = num;
    //         }
    //         hshSet.add(num);
    //     }
    //     return ans;
    // }

    public int findDuplicate(int[] nums) { 
        HashSet<Integer> hshSet= new HashSet<>();        
        for(int num: nums) {
            if(!hshSet.add(num)) {
                return num;
            }
            
        }
        return -1;
    }
}
