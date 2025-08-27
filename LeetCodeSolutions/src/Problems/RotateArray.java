package Problems;
import java.util.*;

public class RotateArray {
	// public void rotate(int[] nums, int k) {
    //     Deque<Integer> arrQue = new ArrayDeque<>();

    //     for(int num: nums) {
    //         arrQue.offer(num);
    //     }

    //     for(int i = 0; i < k;  i++) {
    //         int lastElmnt = arrQue.removeLast();
    //         arrQue.offerFirst(lastElmnt);
    //     }

    //     int i = 0;
    //     while(!arrQue.isEmpty()) {
    //         nums[i] = arrQue.poll();
    //         i++;
    //     }
    // }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newArr = new int[len];
        int z = k % len;

        int j = 0;
        for(int i = nums.length - z;  i < len;  i++) {
            newArr[j] = nums[i];
            j++;
        }

        for(int i = 0;  i < len - z;  i++) {
            newArr[j] = nums[i];
            j++;
        }

        for(int i = 0;  i < len;  i++) {
            nums[i] = newArr[i];
        }
    }
}
