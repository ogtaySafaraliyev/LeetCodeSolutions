package Problems;
import java.util.*;

public class MinimumNumberGame {
	public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> prQue = new PriorityQueue<>();
        for(int num: nums) {
            prQue.offer(num);
        }

        // int[] arr = new int[nums.length];

        int i = 0;
        while(!prQue.isEmpty() && i < nums.length) {
            nums[i+1] = prQue.poll();
            nums[i] = prQue.poll();
            i += 2;
        }
        return nums;

    }
}
