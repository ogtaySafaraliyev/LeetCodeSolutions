package Problems;
import java.util.*;

public class RemoveDuplicatesFromSortedList {
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
		public ListNode deleteDuplicates(ListNode head) {
			Set<Integer> set = new LinkedHashSet<>();
			ListNode current = head;
			while (current != null) {
				int value = current.val;
				set.add(value);
				current = current.next;
			}

			ListNode dummy = new ListNode();
			ListNode tail = dummy;

			for (int num : set) {
				tail.next = new ListNode(num);
				tail = tail.next;
			}
			return dummy.next;
		}
	}
}
