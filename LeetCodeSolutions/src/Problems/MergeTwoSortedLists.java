package Problems;
import java.util.*;

public class MergeTwoSortedLists {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode current1 = list1;
	        List<Integer> arrList = new ArrayList<>();

	        while(current1 != null) {
	            int value = current1.val;
	            arrList.add(value);
	            current1 = current1.next;
	        }

	        ListNode current2 = list2;

	        while(current2 != null) {
	            int value = current2.val;
	            arrList.add(value);
	            current2 = current2.next;
	        }

	        Collections.sort(arrList);

	        ListNode dummy = new ListNode();
	        ListNode tail = dummy;
	        for(int num: arrList) {
	            tail.next = new ListNode(num);
	            tail = tail.next;
	        }
	        return dummy.next;
	    }
	}
}
