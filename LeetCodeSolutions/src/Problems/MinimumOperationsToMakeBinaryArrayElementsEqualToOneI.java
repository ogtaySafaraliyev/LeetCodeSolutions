package Problems;

import java.util.*;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;

        // Traverse up to n–3 (inclusive), flipping whenever we see a 0
        for (int i = 0; i < n - 2; ++i) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ans++;
            }
        }

        int[] myArr = new int[n]; 
        Arrays.fill(myArr, 1);
        return Arrays.equals(myArr, nums) ? ans : -1;

    }

    // public int minOperations(int[] nums) {

    //     int count = 0;
    //     for (int i = 0; i < nums.length - 2; i++) {
    //         if (nums[i] == 0) {
    //             // nums[i] ^= 1;
    //             nums[i + 1] ^= 1;
    //             nums[i + 2] ^= 1;
    //             count++;
    //         }
    //     }
    //     return (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 1 ? count : -1);

    // }

    // public int minOperations(int[] nums) {
    //     int n = nums.length;
    //     Deque<Integer> queue = new ArrayDeque<>(); // store start indices of flips
    //     int flips = 0;

    //     for (int i = 0; i < n; i++) {
    //         // Remove flips whose influence ended before i
    //         while (!queue.isEmpty() && queue.peekFirst() + 3 <= i) {
    //             queue.pollFirst();
    //         }
    //         // Determine the current bit after active flips
    //         int curr = (queue.size() % 2 == 0) ? nums[i] : (nums[i] ^ 1);
    //         // If current bit is 0, we need a flip starting at i
    //         if (curr == 0) {
    //             if (i + 2 >= n) return -1; // can't flip beyond end
    //             queue.addLast(i);
    //             flips++;
    //         }
    //     }
    //     return flips;
    // }
}
