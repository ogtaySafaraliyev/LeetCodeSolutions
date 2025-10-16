package Problems;
import java.util.*;

public class MaximumTwinSumOfALinkedList {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public int pairSum(ListNode head) {
	        List<Integer> list = new ArrayList<>(); 
	        ListNode current = head;

	        while(current != null) {
	            list.add(current.val); 
	            current = current.next;
	        }

	        int max = 0;
	        int j = list.size() - 1;
	        for(int i = 0;  i < list.size();  i++) {
	            int sum = list.get(i) + list.get(j);
	            max = Math.max(max, sum);
	            j--;
	        }

	        return max;        
	    }
	}
}
