package Problems;

import java.util.*;

public class TupleWithSameProduct {
    // public int tupleSameProduct(int[] nums) {
    //     HashMap<Integer, Integer> hshMap = new HashMap<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             int product = nums[i] * nums[j];
    //             hshMap.put(product, hshMap.getOrDefault(product, 0) + 1);
    //         }
    //     }
    //     int ans = 0;
    //     for (var count : hshMap.values()) {
    //         if (count >= 2) {
    //             ans += count * (count - 1) / 2;
    //         }
    //     }
    //     return ans << 3;
    // }

    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        // this little part of loop is called happiness
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int product = nums[i] * nums[j];
                hshMap.put(product, hshMap.getOrDefault(product, 0) + 1);
            }
        }
        int ans = 0;
        for (var count : hshMap.values()) {
            if (count >= 2) {
                ans += count * (count - 1) / 2;
            }
        }
        return ans << 3;
    }
}
