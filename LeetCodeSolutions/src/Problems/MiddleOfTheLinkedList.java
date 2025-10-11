package Problems;
import java.util.*;

public class MiddleOfTheLinkedList {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        List<Integer> list = new ArrayList<>();

	        ListNode current = head;
	        while(current != null) {
	            int value = current.val;
	            list.add(value);
	            current = current.next;
	        }

	        ListNode dummy = new ListNode();
	        ListNode tail = dummy;

	        int mid = list.size() / 2;
	        for(int i = mid;  i < list.size();  i++) {
	            int value = list.get(i);
	            tail.next = new ListNode(value);
	            tail = tail.next;
	        }
	        return dummy.next;

	    }
	}
}
