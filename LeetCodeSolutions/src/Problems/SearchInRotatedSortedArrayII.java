package Problems;
import java.util.*;

public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
        Queue<Integer> prQue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            prQue.offer(nums[i]);
        }

        int k = 0;
        while (!prQue.isEmpty()) {
            nums[k++] = prQue.poll();
        }        

        int left = 0;
        int right = nums.length - 1;

        int mid = (left + right) / 2;

        while (left <= right) {
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return true;
            }
            mid = (left + right) / 2;
        }
        return false;
    }

    // public boolean search(int[] nums, int target) {
    //     Arrays.sort(nums);   // 1 2 3 4 5 6 7 8

    // int left = 0;
    // int right = nums.length - 1;

    // int mid = (left + right) / 2;

    // while(left <= right) {
    //     if(nums[mid] < target) {
    //         left = mid + 1;
    //     }
    //     else if(nums[mid] > target) {
    //         right = mid - 1;
    //     }
    //     else if(nums[mid] == target) {
    //         return true;
    //     }
    //     mid = (left + right) / 2;
    // }
    // return false;
    // }
}
