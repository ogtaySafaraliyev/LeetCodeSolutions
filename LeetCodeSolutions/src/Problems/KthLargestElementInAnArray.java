package Problems;
import java.util.*;

public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> prQue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) {
            prQue.offer(num);
        }        

        while(k > 1) {
            prQue.poll();
            k--;
        }

        return prQue.peek();        
    }
}
