package Problems;
import java.util.*;

public class SearchInsertPosition {
    // public int searchInsert(int[] nums, int target) {      
    //     int start = 0;
    //     int ending = nums.length - 1;
    //     // int mid = (start + ending) / 2; 
    //     // int ans = 0;

    //     while(start <= ending) {
    //         int mid = start + (ending - start) / 2;
    //         if(target > nums[mid]) {
    //             start = mid + 1;
    //         }
    //         else if(target < nums[mid]) {
    //             ending = mid - 1;
    //         }
    //         else if(target == nums[mid]) {
    //             return mid;
    //         }
    //         // mid = (start + ending) / 2;
    //     }       
    //     return start;
    // }

    public int searchInsert(int[] nums, int target) {

        Set<Integer> set = new TreeSet<>();
        for(int num: nums) {
            set.add(num);
        }
        set.add(target);

        int[] arr = new int[set.size()];
        int i = 0;
        for(int num: set) {
            arr[i++] = num;
        }

        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        

        while(left <= right) {
            if(arr[mid] < target) {
                left = mid + 1;
            }

            else if(arr[mid] > target) {
                right = mid - 1;
            }

            else if(arr[mid] == target) {
                return mid;

            }
            mid = (left + right) / 2;

        }
        return 0;
    }   
}
