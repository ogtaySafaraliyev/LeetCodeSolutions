package Problems;
import java.util.*;

public class MoveZeroes {
	public void moveZeroes(int[] nums) { 
        int k = 0;        
        for(int i = 0;  i < nums.length;  i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }            
        }

    }

    // public void moveZeroes(int[] nums) {
    //     Deque<Integer> que = new ArrayDeque<>();
    //     for(int num: nums) {
    //         if(num != 0) {
    //             que.offer(num);
    //         }
    //     }

    //     Arrays.fill(nums, 0);
    //     int i = 0;
    //     while(!que.isEmpty()) {
    //         nums[i++] = que.poll();
            
    //     }
    // }

}
