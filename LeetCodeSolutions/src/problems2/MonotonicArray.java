package problems2;
import java.util.*;

public class MonotonicArray {
    // public boolean isMonotonic(int[] nums) {
    //     int[] ascended = new int[nums.length];
    //     int[] descended = new int[nums.length];

    //     int i = 0;
    //     int j = 0;
    //     for(int num: nums) {
    //         ascended[i++] = num;
    //         descended[j++] = num;
    //     }

    //     Arrays.sort(descended);
    //     Arrays.sort(ascended);
    //     reverseArr(descended);

    //     return Arrays.equals(nums, descended) || Arrays.equals(nums, ascended);
    // }

    // private int[] reverseArr(int[] arr) {
    //     int left = 0;
    //     int right = arr.length - 1;

    //     while(left < right) {
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
            
    //         left++;
    //         right--;
    //     }
    //     return arr;
    // }

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                decreasing = false;
            }
            if(nums[i] > nums[i + 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
