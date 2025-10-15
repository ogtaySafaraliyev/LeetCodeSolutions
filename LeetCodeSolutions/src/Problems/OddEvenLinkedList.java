package Problems;
import java.util.*;

public class OddEvenLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
	    public ListNode oddEvenList(ListNode head) {
	        List<Integer> list = new ArrayList<>();
	        ListNode current = head;
	        while(current != null) {
	            list.add(current.val);
	            current = current.next;
	        }

	        if(list.isEmpty()) {
	            return null;
	        }   

	        ListNode dummy = new ListNode();
	        ListNode tail = dummy;
	        tail.next = new ListNode(list.get(0));
	        tail = tail.next;
	        
	        for(int i = 1; i < list.size();  i++) {
	            if(i % 2 == 0) {
	                tail.next = new ListNode(list.get(i));
	                tail = tail.next;
	            }
	        }

	        for(int i = 1; i < list.size();  i++) {
	            if(i % 2 == 1) {
	                tail.next = new ListNode(list.get(i));
	                tail = tail.next;
	            }
	        }  

	        return dummy.next;
	    }
	}

}
